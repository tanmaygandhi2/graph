package codes;

public class adjacencymatrix {
	
	int vertex;
	int matrix[][];
	
	public adjacencymatrix(int vertex)
	{
		this.vertex=vertex;
		matrix=new int[vertex][vertex];
		
	}
	
	public void add(int u,int v)
	{
		matrix[u][v]=1;
		
		matrix[v][u]=1;  //if undirected
	}
	
	public void print()
	{
		System.out.println("Graph- Adjacency Matrix");
		for(int i=0;i<vertex;i++)
		{
			for(int j=0;j<vertex;j++)
			{
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		
		adjacencymatrix a=new adjacencymatrix(5);
		a.add(0, 1);
		a.add(0, 4);
		a.add(1, 2);
		a.add(1, 3);
		a.add(1, 4);
		a.add(2, 3);
		a.add(3, 4);
		a.print();
	}

}
