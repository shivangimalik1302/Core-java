import java.util.Scanner;

public class BinarySearch 
{
    
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}
    public static int binarySearch(int input[], int element) 
    {
        int n = input.length; 
        int x = element; 
        int result = Search(input, 0, n - 1, x);
        return result;
	}
    public static int Search(int arr[], int l, int r, int x) 
    { 
        if (r >= l) 
        { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return Search(arr, l, mid - 1, x); 
            return Search(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}


