import java.util.Scanner;
public class binarySearch
{
	static Scanner s1 = new Scanner(System.in);
		
    public static int binarySearch(int[] arr, int num){
        
        int count=0;
        int first=0,last=arr.length-1;
        int mid = (first + last)/2;  
        while( first <= last )
        {  
            if (arr[mid] < num)
            {  
                first = mid + 1;     
            }
            else if (arr[mid] == num)
            {  
                count=count+mid;  
                break;  
            }
            else
            {  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
            count=-1;  
        }
        return count;
    }
    
	public static int[] takeInput() 
    {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) 
    {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(binarySearch(arr, num));
	}
}