import java.util.Scanner;

public class RatInMaze {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(ratInAMaze(maze));	
	}
    
    public static boolean ratInAMaze(int maze[][]){

        int[][] path=new int[maze.length][maze.length];
        return ans(maze,0,0,maze.length,path);

    }
    public static boolean ans(int maze[][], int x,int y,int len,int[][] path)
    {
        if(x==len-1 && y==len-1)
        {
            path[x][y]=1;
            return true;
        }
        else if(x<0 || y<0 || x>=len || y>=len)
        {
            return false;
        }
        else if(path[x][y]==1)
        {
            return false;
        }
        else if(maze[x][y]==0)
        {
            return false;
        }
        path[x][y]=1;

        if(ans(maze,x-1,y,len,path))
            return true;

        if(ans(maze,x,y+1,len,path))
            return true;

        if(ans(maze,x+1,y,len,path))
            return true;

        if(ans(maze,x,y-1,len,path))
            return true;

        return false;
    }

}
