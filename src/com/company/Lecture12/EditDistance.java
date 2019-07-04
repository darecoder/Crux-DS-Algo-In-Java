package com.company.Lecture12;

public class EditDistance {
    public static void main(String[] args) {
        String f = "dog";
        String s = "don";
        Integer[][] mem = new Integer[f.length()+1][s.length()+1];
        System.out.println(editDist(f,s,f.length(),s.length()));
        System.out.println(editDistDP(f,s,f.length(),s.length(),mem));
        System.out.println(editDistDPitr(f,s,mem));
    }

    public static int editDist(String f,String s,int flen,int slen){
        if(flen == 0){
            return slen;
        }
        if(slen == 0){
            return flen;
        }

        int count = 0;
        if(f.charAt(flen - 1) == s.charAt(slen - 1)){
            count = editDist(f,s,flen-1,slen-1);
        }else {
            int right = 1 + editDist(f,s,flen-1,slen);
            int left = 1 + editDist(f,s,flen,slen-1);
            int both = 1 + editDist(f,s,flen-1,slen-1);
            count = Math.min(right,Math.min(left,both));
        }
        return count;
    }

    public static int editDistDP(String f,String s,int flen,int slen,Integer[][] mem){
        if(flen == 0){
            return slen;
        }
        if(slen == 0){
            return flen;
        }

        if(mem[flen][slen] != null) {
            return mem[flen][slen];
        }else{
            if(f.charAt(flen - 1) == s.charAt(slen - 1)){
                mem[flen][slen] = editDistDP(f,s,flen-1,slen-1,mem);
            }else{
                int right = 1 + editDistDP(f,s,flen-1,slen,mem);
                int left = 1 + editDistDP(f,s,flen,slen-1,mem);
                int both = 1 + editDistDP(f,s,flen-1,slen-1,mem);
                mem[flen][slen] = Math.min(right,Math.min(left,both));
            }
        }
        return mem[flen][slen];
    }

    public static int editDistDPitr(String f,String s,Integer[][] mem){

        int flen,slen = 0;
        for (flen = 0; flen <= f.length(); flen++) {
            for (slen = 0; slen <= s.length(); slen++) {
                if(flen == 0){
                    mem[flen][slen] = slen;
                }else if(slen == 0){
                    mem[flen][slen] = flen;
                }
                else{
                    if(f.charAt(flen-1) == s.charAt(slen-1)){
                        mem[flen][slen] = mem[flen-1][slen-1];
                    }else{
                        mem[flen][slen] = 1+ Math.min(mem[flen-1][slen],Math.min(mem[flen][slen-1],mem[flen-1][slen-1]));
                    }
                }
            }
        }

        return mem[flen][slen];
    }
}
