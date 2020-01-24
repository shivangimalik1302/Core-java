import java.util.*;
public class Main {

    public static void main(String[] args) {
        int a=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(a++);
            }
            for(int k=n-1;k>i;k--)
            {
                System.out.print(" ");
            }
            
            for(int l=n-1;l>i;l--)
            {
                System.out.print(" ");
            }
            int b=i+1;
            for(int m=0;m<=i;m++)
            {
                System.out.print(b--);
            }
            System.out.println();
        }
    }
}
