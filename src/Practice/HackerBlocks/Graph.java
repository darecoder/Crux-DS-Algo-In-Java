package Practice.HackerBlocks;

import java.util.*;

// A Java Program to detect cycle in an undirected graph


// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List Represntation

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // A recursive function that uses visited[] and parent to detect
    // cycle in subgraph reachable from vertex v.
    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
        // Mark the current node as visited
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();

            // If an adjacent is not visited, then recur for that
            // adjacent
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }

            // If an adjacent is visited and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent)
                return true;
        }
        return false;
    }

    // Returns true if the graph contains a cycle, else false.
    Boolean isCyclic()
    {
        // Mark all the vertices as not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++)
            if (!visited[u]) // Don't recur for u if already visited
                if (isCyclicUtil(u, visited, -1))
                    return true;

        return false;
    }


    // Driver method to test above methods
    public static void main(String args[])
    {
        // Create a graph given in the above diagram
        Graph g1 = new Graph(6);
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- > 0){
            int m = s.nextInt();
            int n = s.nextInt();
            if(n == 0){
                System.out.println("no");
                System.exit(0);
            }
            while (n-- > 0){
                int n1 = s.nextInt();
                int n2 = s.nextInt();
//                g1.addVertex(n1);
//                graph.addVertex(n2);
                g1.addEdge(n1,n2);
            }
            if (g1.isCyclic()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}