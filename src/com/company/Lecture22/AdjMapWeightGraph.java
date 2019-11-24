package com.company.Lecture22;

import java.util.*;

public class AdjMapWeightGraph<E> {

    private Map<E, Vertex> vertices = new HashMap<E, Vertex>();

    private class Vertex{
        E value;
        Map<Vertex, Integer> neighbours = new HashMap<Vertex, Integer>();

        public Vertex(E value) {
            this.value = value;
        }

        public void addNeighbour(Vertex vertex, Integer weight){
            neighbours.put(vertex, weight);
        }
    }

    private class Edge{
        private Vertex start;
        private Vertex end;
        private  Integer weight;

        public Edge(Vertex start, Vertex end, Integer weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    public Integer kruskal(){
        ArrayList<Edge> list = new ArrayList<Edge>();
        for(Vertex start : vertices.values()){
            for(Vertex end : start.neighbours.keySet()){
                Integer weight = start.neighbours.get(end.value);
                list.add(new Edge(start, end, weight));
            }
        }

        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

//        Collections.sort(list, (o1, o2) -> o1.weight - o2.weight);    Lambda Expressions

        Map<Vertex, Vertex> parents = generateParents();
        int total = 0;
        for (Edge edge : list){
            if(Union(edge.start, edge.end, parents)){
                total += edge.weight;
            }
        }

        return total;
    }

    public int prims(){
        Vertex start = vertices.values().iterator().next();
        Set<Vertex> visited = new HashSet<Vertex>();

        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

        visited.add(start);
        for (Vertex end : start.neighbours.keySet()){
            int weight = start.neighbours.get(end.value);
            queue.add(new Edge(start, end, weight));
        }
        int total = 0;
        while (!queue.isEmpty()){
            Edge edge = queue.remove();
            if (!visited.contains(edge.end)){
                total += edge.weight;

                Vertex temp_s = edge.end;
                for (Vertex temp_e : temp_s.neighbours.keySet()){
                    if (!visited.contains(temp_e)){
                        int weight = temp_s.neighbours.get(temp_e.value);
                        queue.add(new Edge(temp_s, temp_e, weight));

                    }
                }
            }
        }
        return total;
    }

    public void addVertex(E value){
        if(!vertices.containsKey(value)){
            vertices.put(value,new Vertex(value));
        }
    }

    public void addEdge(E first, E second, Integer weight){
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);

        if(f != null && s != null && f != s){    //f comparing to s to deny self loops
            f.addNeighbour(s, weight);
            s.addNeighbour(f, weight);
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

    public void DFT(E value){
        Vertex v = vertices.get(value);

        Stack<Vertex> stack = new Stack<Vertex>();
        Set<Vertex> set= new HashSet<Vertex>();

        set.add(v);
        stack.push(v);

        while (!stack.empty()){
            Vertex top = stack.pop();
            System.out.print(top.value + " ");

            for (Vertex vertex : top.neighbours.keySet()){
                if(!set.contains(vertex)){
                    stack.push(vertex);
                    set.add(vertex);
                }
            }
        }
    }
}
