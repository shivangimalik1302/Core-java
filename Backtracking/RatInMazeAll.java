import java.util.Scanner;


public class RatInMazeAll {

	public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < n; j++)
            {
				maze[i][j] = s.nextInt();
			}
		}
		ratInAMaze(maze);	
	}
    public static void ratInAMaze(int maze[][])
    {
	
        int[][] path=new int[maze.length][maze.length];
		ans(maze,0,0,maze.length,path);
	}
    public static void ans(int[][] maze,int x,int y,int len,int path[][])
    {
        if(x<0 || x>len-1 || y<0 || y>len-1 || path[x][y]==1 || maze[x][y]==0)
            return;
        
        if(x==len-1 && y==len-1)
        {
            path[x][y]=1;        
                for(int i=0;i<len;i++)
            {
                for(int j=0;j<len;j++)
                {
                    System.out.print(path[i][j]+" ");
                    
                }
            }
            System.out.println();
            path[x][y]=0;
        
        }
        path[x][y]=1;
        ans(maze,x-1,y,len,path);
        ans(maze,x,y+1,len,path);
        ans(maze,x+1,y,len,path);
        ans(maze,x,y-1,len,path);
        path[x][y]=0;
    }

}
