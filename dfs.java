import java.util.*;
public class dfs {
    int vertex;
    LinkedList<Integer> list[];

    public dfs(int v)
    {
        this.vertex=v;
        list=new LinkedList[vertex];
        for(int i=0;i<vertex;i++)
        {
            list[i]=new LinkedList<>();
        }
    }

    public void add(int u,int v)
    {
        list[u].addFirst(v);
    }

    public void DFS()
    {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> s =new Stack<Integer>();

        for(int i=0;i<vertex;i++)
        {
            if(visited[i]==false){
                s.push(i);
                visited[i]=true;
                while(s.isEmpty()==false)
                {
                    int x=s.pop();
                    System.out.print(x +" ");
                    LinkedList<Integer> n =list[x];
                    for(int j=0;j<n.size();j++)
                    {
                        int a=n.get(j);
                        if(visited[a]==false)
                        {
                            s.push(a);
                            visited[a]=true;
                        }
                    }
                }
            }
        }
    }
    public void print(){
        for(int i=0;i<vertex;i++)
        {
            LinkedList<Integer> li = list[i];
            if(li.isEmpty()==false)
            {
                System.out.print("source = " + i +" is connected to :" );
                for(int j=0;j<li.size();j++)
                {
                    System.out.print(" "  + li.get(j));
                }
           } 
           System.out.println();
        }
    }

    public static void main(String[] args)
    {
        dfs obj =new dfs(6);
        obj.add(0, 1);
        obj.add(0, 2);
        obj.add(1, 2);
        obj.add(1, 3);
        obj.add(3, 4);
        obj.add(2, 3);
        obj.add(4, 0);
        obj.add(4, 1);
        obj.add(4, 5);
        obj.print();
        obj.DFS();
    }
}