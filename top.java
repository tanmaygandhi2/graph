import java.util.*;
// topological sort using adjacency list as a representation of graph.
public class top {
    int vertex;
    LinkedList<Integer> adj[];

    top(int vertex)
    {
        this.vertex=vertex;
        adj=new LinkedList[vertex];
        for(int i=0;i<vertex;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }

    void add(int u,int v)
    {
        adj[u].add(v);
    }

    void func(int v, boolean visited[],Stack<Integer> stack)
    {
        visited[v]=true;
        int i;
        Iterator<Integer> it= adj[v].iterator();
        while(it.hasNext())
        {
            i=it.next();
            if(!visited[i])
            {
                func(i, visited, stack);
            }
        }

        stack.push(v);
    }

    void topsort()
    {
        Stack<Integer> stack =new Stack<Integer>();
        boolean visited[]=new boolean[vertex];
        for(int i=0;i<vertex;i++)
            visited[i]=false;
        for(int i=0;i<vertex;i++)
        {
            if(visited[i]==false)
                func(i,visited,stack);
        } 
        while(stack.empty()==false)
            System.out.println(stack.pop() );   
    }

    public static void main(String[] args)
    {
        top obj = new top(6);
        obj.add(5, 2);
        obj.add(5, 0);
        obj.add(4, 0);
        obj.add(4, 1);
        obj.add(2, 3);
        obj.add(3, 1);
        obj.topsort();
    }
}
