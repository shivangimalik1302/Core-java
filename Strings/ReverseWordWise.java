import java.util.Scanner;

public class ReverseWordWise {
    
    public static String reverseWordWise(String str) {
        String s="";
        int j=str.length();
        for(int i=str.length()-1;i>=-1;i--)
        {
            
            if(i==-1 || str.charAt(i)==' ')
            {
                s+=str.substring(i+1,j);
                s+=" ";
                j=i;
            }
        }
        return s;
	}
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}
    
    
}
