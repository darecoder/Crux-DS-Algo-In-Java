package com.company.Lecture22;

import java.util.*;

public class
AdjMapGraph<E> {

    private Map<E, Vertex> vertices = new HashMap<E, Vertex>();

    public void addVertex(E value){
        if(!vertices.containsKey(value)){
            vertices.put(value,new Vertex(value));
        }
    }

    public void addEdge(E first, E second){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if(f != null && s != null && f != s){    //f comparing to s to deny self loops
            f.neighbours.put(second, s);
            s.neighbours.put(first, f);

        }
    }

    public void removeEdge(E first, E second){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if(f != null && s != null && f != s){    //f comparing to s to deny self loops
            f.neighbours.remove(second);
            s.neighbours.remove(first);

        }
    }

    private Map<Vertex, Vertex> generateParents(){
        Map<Vertex,Vertex> parents = new HashMap<Vertex, Vertex>();

        for(Vertex vertex : vertices.values()){
            parents.put(vertex, null);
        }

        return parents;
    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parents){
        while (parents.get(vertex) != null){
            vertex = parents.get(vertex);
        }

        return vertex;
    }

    private boolean Union(Vertex first,Vertex second, Map<Vertex, Vertex> parents){
        first = find(first, parents);
        second = find(second, parents);

        if(first != second){
            parents.put(first, second);
            return true;
        }

        return false;
    }

    private class Vertex{
        E value;
        Map<E, Vertex> neighbours = new HashMap<E, Vertex>();

        public Vertex(E value) {
            this.value = value;
        }
    }

    public void DFT(E value){
        Vertex v = vertices.get(value);

        Stack<Vertex> stack = new Stack<Vertex>();
        Set<Vertex> set= new HashSet<Vertex>();

        set.add(v);
        stack.push(v);

        while (!stack.empty()){
            Vertex top = stack.pop();
            System.out.print(top.value + " ");

            for (Vertex vertex : top.neighbours.values()){
                if(!set.contains(vertex)){
                    stack.push(vertex);
                    set.add(vertex);
                }
            }
        }
    }
}
