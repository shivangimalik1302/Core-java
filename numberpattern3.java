import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		Solution.printPattern(n);		
	}
}

public class Solution {
	public static void printPattern(int n){	
        int i,j,k;
        for(i = -(n-1); i < n; i++){
            j = n;
            for(k = -(n-1); k < n; k++){
                if(Math.abs(i) < Math.abs(k))
                {
                    if(k < 0)
                    {
                        System.out.print(j+" ");
                        j--;
                    }
                    else
                    {
                        j++;
                        System.out.print(j+" ");
                    }
                }
                else
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
	}
}