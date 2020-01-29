import java.util.Scanner;

public class SpiralPrint
{
	static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput2D(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
    
	public static void spiralPrint(int a[][]){
        int m=a.length;
        int n=a[0].length;
        int k=0,l=0;
        while(k<m && l<n)
        {
            for(int i=l;i<n;i++)
            { 
                System.out.print(a[k][i] +" "); 
            }
            k++;
            for(int i=k;i<m;i++)
            { 
                System.out.print(a[i][n-1] +" "); 
            }
            n--;
            if(k<m) 
            { 
                for(int i=n-1;i>=l;i--) 
                { 
                    System.out.print(a[m-1][i]+" "); 
                } 
                m--; 
            } 

            if(l<n) 
            { 
                for(int i=m-1;i>=k;i--) 
                { 
                    System.out.print(a[i][l]+" "); 
                } 
                l++; 
            } 
        }
    }
    
	public static void main(String[] args) {
		int a[][] = takeInput2D();
		spiralPrint(a);
	}
}