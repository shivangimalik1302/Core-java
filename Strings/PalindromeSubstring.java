import java.util.Scanner;

public class PalindromeSubstring {

public static int countPalindromeSubstrings(String s) {
        int count=s.length();
        for(int i=0;i<s.length();i++)
        {
            int mid=i;
            int left=mid-1;
            int right=mid+1;
            while(left>=0 && right<s.length())
            {
                if(s.charAt(left)!=s.charAt(right))
                {
                     break;
                }
                if(s.charAt(left)==s.charAt(right))
                {
                    count++;
                }
                left--;
                right++;
            }

            left=i;
            right=i+1;
            while(left>=0 && right<s.length())
            {
                if(s.charAt(left)!=s.charAt(right))
                {
                     break;
                }
                if(s.charAt(left)==s.charAt(right))
                {
                    count++;
                }
                left--;
                right++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int count = countPalindromeSubstrings(input);
		System.out.println(count);
	}
}