import java.util.*;

 class bfs {
    private int v;
    private LinkedList<Integer> adj[];

    bfs(int a)
    {
        v=a;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();

    }

    void add(int u,int v) {
        adj[u].add(v);

    }

    void FS(int s){
            boolean visited[]= new boolean[v];
            for(int i=0;i<v;i++)
                visited[i]=false;
            
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s]=true;
            queue.add(s);

        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.println(s);

            Iterator<Integer> it = adj[s].listIterator();

            while(it.hasNext())
            {
                int n=it.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
   }

   public static void main(String args[])
   {
       bfs s= new bfs(4);
       s.add(0, 1);
       s.add(0, 2);
       s.add(1, 2);
       s.add(2, 0);
       s.add(2, 3);
       s.add(3, 3);
       s.add(2, 2);

       s.FS(2);
   }
}