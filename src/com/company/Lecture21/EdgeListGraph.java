package com.company.Lecture21;

import java.util.LinkedList;

public class EdgeListGraph <E> {
    public LinkedList<Vertex> vertices = new LinkedList<Vertex>();
    public LinkedList<Edge> edges = new LinkedList<Edge>();

    private class Vertex{
        private E value;
        public Vertex(E value){
            this.value = value;
        }
    }

    private class Edge{
        private Vertex start;
        private Vertex end;

        public Edge(Vertex start, Vertex end){
            this.start = start;
            this.end = end;
        }
    }

    //We need to traverse all edges to find neighbours of a particular vertex
    // for adding a vertex we need to traverse whole vertex list
    // for adding edge we have to traverse both vertices and edge list
    public void addVertex(E value){
        if(find(value) == null){
            vertices.add(new Vertex(value));
        }

    }

    private Vertex find(E value){
        for (Vertex vertex : vertices) {
            if(vertex.value.equals(value)){
                return vertex;
            }
        }

        return null;
    }

    public void addEdge(E value1, E value2){
        Vertex A = find(value1);
        Vertex B = find(value2);
        if(A != null && B != null){
            edges.add(new Edge(A,B));
        }
    }

}
