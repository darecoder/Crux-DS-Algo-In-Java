package com.company.Lecture21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GraphClient {
    public static void main(String[] args) {
        AdjListGraph<Integer> graph = new AdjListGraph<Integer>();

        List<LinkedList<Integer>> list;

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

//        graph.addEdge(1,2);
//        graph.addEdge(1,3);
//        graph.addEdge(1,5);
//
//        graph.addEdge(4,5);
//        graph.addEdge(4,3);

//        graph.DFT(1);
//        System.out.println();
//        graph.BFT(1);

//        System.out.println(graph.BFS(1,4));
//        System.out.println(graph.BFS(1,7));

//        list = graph.connectedComponent();
//        System.out.println(list);
//
//        graph.addEdge(1,5);
//        graph.addEdge(3,5);
//        graph.addEdge(2,4);
//        graph.addEdge(2,6);
//        graph.addEdge(4,6);
//        graph.addEdge(2,1);
//
//        System.out.println(graph.bipartiteGraph());

        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(4,1);
        graph.addEdge(6,3);

        System.out.println(graph.isCyclic(1));
    }
}
