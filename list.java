import java.util.*;

class list
{
    static void add(ArrayList<ArrayList<Integer>> adj, int u,int v){
            adj.get(u).add(v);
            adj.get(v).add(u);
    }

    static void print(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.println("\n List of vertex " + i);
            for(int j=0;j<adj.get(i).size();j++)
            {
                    System.out.print(" " +adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int v=5;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());

        add(adj,0,1);
        add(adj,0,4);
        add(adj,1,2);
        add(adj,1,3);
        add(adj,1,4);    
        add(adj,2,3);
        add(adj,3,4);
        
        print(adj);
    }
}