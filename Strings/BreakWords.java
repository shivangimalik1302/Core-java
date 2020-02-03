import java.util.Scanner;

public class BreakWords{

    
    public static String breakWords(String input){
        int start=0;
        String s="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                int n=i-start;
                if(n>=4 && n%2==0)
                {
                    s+=input.substring(start,start+n/2)+" "+input.substring(start+n/2,i+1);

                }
                else
                    s+=input.substring(start,i+1);
                start=i+1;
            }


        }

        return s;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		System.out.println(breakWords(input));
	}

}
