import java.util.Scanner;

public class Solution{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int b=i;
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                b++;
                System.out.print(b);
            }
            for(int l=0;l<i;l++)
            {
                b--;
                System.out.print(b);
            }
            System.out.println();
        }
	}
}
