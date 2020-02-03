import java.util.*;

public class LargestSubstring {
    
    public static String findLargestUniqueSubstring(String str){
        HashMap<Character,Integer> hs=new HashMap<>();
        int maxlen=0;
        int start=0;
        int startans=0;
        int endans=0;
        for(int i=0;i<str.length();i++)
        {
            // int end=i;
            if(hs.containsKey(str.charAt(i)))
            {
                start=Math.max(hs.get(str.charAt(i))+1,start);
                // System.out.print(start);
                hs.put(str.charAt(i),i);
            }
            else
            {
                hs.put(str.charAt(i),i); 
            }
              int len=i-start;
                if(len>maxlen)
                {
                    maxlen=len;
                    startans=start;
                    endans=i;
                }
        }
        // System.out.print(maxlen);
        String s=str.substring(startans,endans+1);
        return s;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(findLargestUniqueSubstring(input));
	}
}
