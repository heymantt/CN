import java.util.*;

class dijkstra
{
  int source,current,min,dc,count;
  int [][]read_graph(int n,int a[][])
  {
      Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter the adjacency matrix");
	  
	    for(int i=0;i<n;i++)
		{
		   for(int j=0;j<n;j++)
		   {
		      a[i][j]=sc.nextInt();
			  
		   }
		}
     return a;
    }

   void dijik(int n,int a[][])
   {
       Scanner sc= new Scanner(System.in);
       int[] visited=new int[n];
       int[] dist=new int[n];	
	   int[] path=new int[n];		  
	   int j;
	   
	   for(int i=0;i<n;i++)
	   {
	      visited[i]=0;
		  dist[i]=32767;
		  path[i]=32767;
	   }
	   
	   
	   
	   System.out.println("Enter the starting node ");
	   source= sc.nextInt();
	   visited[current]=1;
	   dist[current]=0;
	   
	   
	   while(count<=n)
	   
	   {
	         dc=dist[current];
		  
		     for(int i=0;i<n;i++)
		     {
		         if(a[current][i]!=0 && visited[i]!=1)
			       {
					   if(a[current][i]+dc<dist[i])
					   {
			         dist[i]=a[current][i] + dc;
			         path[i]=current;
					   }
		       	   }
		     }
             min=32767;

	         for(int i=0;i<n;i++)
	            { 
	                if(visited[i]!=1 && dist[i]<min)
	                 {
	                           min=dist[i];
	                           current=i;
	                 }
	            }

             visited[current]=1;
	         count++;
	 }

	 for(int i=1;i<n;i++)
	 {
	  System.out.println("distance from"+source+"to"+i+"is"+dist[i]);
	 }
	 for(int i=1;i<n;i++)
	 {
	   System.out.println("\n"+"path for"+i+"is"+i);
	   j=i;
	   while(j!=source)
	   {
	      j=path[j];
		  System.out.println("<-"+j);
}
}
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
dijkstra d=new dijkstra();
 int n;
 System.out.println("Enter the number of nodes");
 n=sc.nextInt();
 int[][]a=new int[n][n];
 a=d.read_graph(n,a);
 d.dijik(n,a);

}

}