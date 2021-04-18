package com.company.Lecture22;

import java.util.*;
import static java.util.Comparator.*;

public class AdjMapWeightGraph<E> {
    private Map<E, Vertex> vertices = new HashMap<>();

    private class Vertex{
        E value;
        Map<Vertex, Integer> neighbours = new HashMap<>();
        public Vertex(E value) {
            this.value = value;
        }
        public void addNeighbour(Vertex vertex, Integer weight){
            neighbours.put(vertex,weight);
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

        if(first != second) {
            parents.put(first, second);
            return true;
        }
        return false;
    }

    public Integer kruskal(){
        ArrayList<Edge> list = new ArrayList<Edge>();
        for(Vertex start : vertices.values()){
            for(Vertex end : start.neighbours.keySet()){
                Integer weight = start.neighbours.get(end);
                list.add(new Edge(start, end, weight));
            }
        }

//        Collections.sort(list, new Comparator<Edge>() {
//            @Override
//            public int compare(Edge o1, Edge o2) {
//                return o1.weight - o2.weight;
//            }
//        });

//        Collections.sort(list, (o1, o2) -> o1.weight - o2.weight);    Lambda Expressions

        list.sort(comparingInt(o -> o.weight));

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

        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(comparingInt(o -> o.weight));
        visited.add(start);
        for (Vertex end : start.neighbours.keySet()){
            int weight = start.neighbours.get(end);
            queue.add(new Edge(start, end, weight));
        }
        int total = 0;
        while (!queue.isEmpty()){
            Edge edge = queue.remove();
            if (!visited.contains(edge.end)){
                total += edge.weight;

                Vertex temp_s = edge.end;
                visited.add(temp_s);
                for (Vertex temp_e : temp_s.neighbours.keySet()){
                    if (!visited.contains(temp_e)){
                        int weight = temp_s.neighbours.get(temp_e);
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

    public class DjPair implements Comparable<DjPair> {
        int cost;
        E connectingVertex;
        E endVertex;

        DjPair(E endVertex, int cost, E acquirer) {
            this.connectingVertex = acquirer;
            this.endVertex = endVertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(DjPair o) {
            return this.cost - o.cost;
        }
    }

    public void dijkstra(E source) {
        HashMap<E, DjPair> map = new HashMap<>();
        PriorityQueue<DjPair> minheap = new PriorityQueue<>();
        Set<E> allvertices = this.vertices.keySet();

        /* Saare vertices pe traverse kar rhe hain and if it is the same
         as source toh usme cost 0 daal rehe hain nhi toh infinity */
        for (E vertex : allvertices) {
            DjPair d;
            if (vertex.equals(source)) {
                d = new DjPair(vertex, 0, null);
            } else {
                d = new DjPair(vertex, Integer.MAX_VALUE, null);
            }

            //saare DjPair of vertices heap mein add kar de rhe hain
            minheap.add(d);
            map.put(vertex, d);
        }

        //Heap mein traverse kar rhe hain
        while (!minheap.isEmpty()) {
            //Minimum DjPair on the basis of cost remove karenge
            DjPair current = minheap.remove();
            map.remove(current.endVertex);

            /* Us pair ke 2nd vertex ya keh lo connected
             vertex ko aur uski cost ko print kar dia */
            System.out.println(current.endVertex +"->"+current.cost);

            /* Ab jis vertex ko print kia uske saare neighbouring vertex
            ki cost jaake update kar do, means ki agar mai uski neighbouring
             vertex pe is vertex ke through jaaun toh kya cost hogi */
            Set<Vertex> neighbour = vertices.get(current.endVertex).neighbours.keySet();
            for (Vertex padosi : neighbour) {
                if (map.containsKey(padosi.value)) {
                    DjPair pair = map.get(padosi.value);
                    int oldcost = pair.cost;
                    /* source se current vertex tak ka cost +
                    current vertex se padosi tak jaane ka cost */
                    int newcost = current.cost +
                            vertices.get(current.endVertex).neighbours.get(padosi);
                    if (newcost < oldcost) {
                        /* Heap se pichla cost vala pair remove kar
                        do kyunki naya cost jaada chhota hai ab */
                        minheap.remove(map.get(padosi.value));

                        // Naya pair banao naye cost ke saath aur heap mein add kar do
                        pair.cost = newcost;
                        pair.connectingVertex = current.endVertex;
                        map.put(padosi.value, pair);
                        minheap.add(pair);
                    }
                }
            }
        }

    }
}
