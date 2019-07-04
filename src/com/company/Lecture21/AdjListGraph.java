package com.company.Lecture21;

import java.util.*;

public class AdjListGraph <E> {

    private Map<E, Vertex> vertices = new HashMap<E, Vertex>();

    private class Vertex{
        E value;
        List<Vertex> neighbours = new LinkedList<Vertex>();

        public Vertex(E value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public void addVertex(E value){
        if(vertices.get(value) == null){
            vertices.put(value, new Vertex(value));
        }

    }

    public void addEdge(E first, E second){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if(f != null && s != null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public void DFT(E start){
        Vertex v = vertices.get(start);

        Stack<Vertex> stack = new Stack<Vertex>();
        Set<Vertex> set = new HashSet<Vertex>();

        stack.push(v);
        set.add(v);

        while (!stack.empty()){
            Vertex top = stack.pop();
            System.out.print(top.value + " ");

            for(Vertex padosi : top.neighbours){
                if(!set.contains(padosi)){    //agar set mein nhi hai toh hi stack mein daalo aur set mein daalo
                    stack.push(padosi);
                    set.add(padosi);
                }
            }
        }
    }

    public void BFT(E start){
        Vertex v = vertices.get(start);

        Queue<Vertex> queue = new LinkedList<Vertex>();
        Set<Vertex> set = new HashSet<Vertex>();

        queue.add(v);
        set.add(v);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.print(top.value + " ");

            for(Vertex padosi : top.neighbours){
                if(!set.contains(padosi)){
                    queue.add(padosi);
                    set.add(padosi);
                }
            }
        }

    }

    public boolean DFS(E start,E target){
        Vertex v = vertices.get(start);

        Stack<Vertex> stack = new Stack<Vertex>();
        Set<Vertex> set = new HashSet<Vertex>();

        stack.push(v);
        set.add(v);

        while (!stack.empty()){
            Vertex top = stack.pop();
            if(top.value.equals(target)){
                return true;
            }

            for(Vertex padosi : top.neighbours){
                if(!set.contains(padosi)){    //agar set mein nhi hai toh hi stack mein daalo aur set mein daalo
                    stack.push(padosi);
                    set.add(padosi);
                }
            }
        }

        return false;
    }

    public boolean BFS(E start, E target){
        Vertex v = vertices.get(start);

        Queue<Vertex> queue = new LinkedList<Vertex>();
        Set<Vertex> set = new HashSet<Vertex>();

        queue.add(v);
        set.add(v);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            if(top.value.equals(target)){
                return true;
            }

            for(Vertex padosi : top.neighbours){
                if(!set.contains(padosi)){
                    queue.add(padosi);
                    set.add(padosi);
                }
            }
        }

        return false;
    }

    public List<LinkedList<E>> connectedComponent(){

        List<LinkedList<E>> list = new LinkedList<LinkedList<E>>();

        Stack<Vertex> stack = new Stack<Vertex>();
        Set<Vertex> set = new HashSet<Vertex>();

        int i = 0;
        for (Vertex start : vertices.values()) {
            LinkedList<E> tempList = new LinkedList<E>();
            if(set.contains(start)){
                continue;
            }

            stack.push(start);
            set.add(start);

            while (!stack.empty()){
                Vertex top = stack.pop();
//                System.out.print(top.value + " ");
                tempList.add(top.value);

                for(Vertex padosi : top.neighbours){
                    if(!set.contains(padosi)){    //agar set mein nhi hai toh hi stack mein daalo aur set mein daalo
                        stack.push(padosi);
                        set.add(padosi);
                    }
                }
            }

//            System.out.println();
            i++;
            list.add(tempList);
        }

        return list;
    }

    public boolean bipartiteGraph(){

        Set<Vertex> red = new HashSet<Vertex>();
        Set<Vertex> black = new HashSet<Vertex>();
        Stack<Vertex> stack = new Stack<Vertex>();

        for (Vertex v : vertices.values()){
            if (!red.contains(v) &&  ! black.contains(v)){
                stack.push(v);
                red.add(v);

                while (!stack.empty()){
                    Vertex top = stack.pop();

                    for (Vertex padosi : top.neighbours){

                        if (red.contains(top)){
                            if (red.contains(padosi)) {
                                return false;
                            } else {
                                if (!black.contains(padosi)){
                                    black.add(padosi);
                                    stack.push(padosi);
                                }
                            }
                        } else {
                            if (black.contains(padosi)) {
                                return false;
                            } else {
                                if (!red.contains(padosi)){
                                    red.add(padosi);
                                    stack.push(padosi);
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    public boolean isConnected(){
        List<LinkedList<E>> list = this.connectedComponent();
        if(list.size() == 1){
            return true;
        }
        return false;
    }

    public boolean isCyclic(E start){
            Vertex v = vertices.get(start);

            Queue<Vertex> queue = new LinkedList<Vertex>();
            Set<Vertex> set = new HashSet<Vertex>();

            queue.add(v);
            set.add(v);

            while (!queue.isEmpty()){
                Vertex top = queue.remove();

                for(Vertex padosi : top.neighbours){
                    if(!set.contains(padosi)){
                        queue.add(padosi);
                        set.add(padosi);
                    }else{
                        return true;
                    }
                }
            }

        return false;
    }
}
