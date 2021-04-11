package com.company.Lecture12;

public class LongSubseq {
    public static void main(String[] args) {
        String f ="aman";
        String s ="naman";
        Integer[][] mem = new Integer[f.length()+1][s.length()+1];
        System.out.println(lcs(f,s,f.length(),s.length()));
        System.out.println(lcsDP(f,s,f.length(),s.length(),mem));
        System.out.println(lcsDPitr(f,s,f.length(),s.length(),mem));

    }

    public static int lcs(String f,String s,int flen,int slen){
        if(flen == 0 || slen == 0){
            return 0;
        }
        int count;
        if(f.charAt(flen-1) == s.charAt(slen-1)){
            count = 1 + lcs(f,s,flen-1,slen-1);
        }else{
            int right = lcs(f,s,flen-1,slen);
            int left = lcs(f,s,flen,slen-1);
            count = Math.max(right,left);
        }
        return count;
    }

    public static int lcsDP(String f,String s,int flen,int slen,Integer[][] mem){
        if(flen == 0 || slen == 0){
            return 0;
        }

        if(mem[flen][slen] != null) {
            return mem[flen][slen];
        }else{
            if(f.charAt(flen-1) == s.charAt(slen-1)){
                mem[flen][slen]= 1 + lcsDP(f,s,flen-1,slen-1,mem);
            }else{
                int right = lcsDP(f,s,flen-1,slen,mem);
                int left = lcsDP(f,s,flen,slen-1,mem);
                mem[flen][slen] = Math.max(right,left);
            }
        }
        return mem[flen][slen];
    }

    public static int lcsDPitr(String f,String s,int flen,int slen,Integer[][] mem){
        for (int i = 0; i <= flen ; i++) {
            for (int j = 0; j <= slen; j++) {
                if(i == 0 || j == 0){
                    mem[i][j] = 0;
                }else {
                    if(f.charAt(i - 1) == s.charAt(j - 1)){
                        mem[i][j] = 1 + mem[i-1][j-1];
                    }else{
                        mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
                    }
                }
            }
        }
        return mem[flen][slen];
    }
}
