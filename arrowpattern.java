import java.util.*;
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n/2+2;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int p=n/2;
        for(int i=0;i<p;i++)
        {
            for(int j=p-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=p-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
