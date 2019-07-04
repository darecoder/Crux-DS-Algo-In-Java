package Practice.HackerBlocks;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graphs
{
    private int V;
    private LinkedList<Integer> adj[];

    Graphs(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();

            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }

            else if (i != parent)
                return true;
        }
        return false;
    }

    Boolean isCyclic()
    {
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        for (int u = 0; u < V; u++)
            if (!visited[u])
                if (isCyclicUtil(u, visited, -1))
                    return true;

        return false;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int v = s.nextInt();
            int e = s.nextInt();

            Graphs g = new Graphs(v);
            while (e-- > 0){
                int v1 = s.nextInt();
                int v2 = s.nextInt();
                g.addEdge(v1-1,v2-1);
            }
            if (g.isCyclic()){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
