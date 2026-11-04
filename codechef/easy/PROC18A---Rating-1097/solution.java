import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test = 1; test <= T; test++) {
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for (int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    int total = totalImpress(n, k, arr);
		    System.out.println(total);
		}
	}
	
	public static int totalImpress(int n, int k, int[] arr) {
	    
	    int firstKsum = 0;
	    int min = (n < k) ? n : k;
	    
	    for (int i = 0; i < min; i++) {
	        firstKsum += arr[i];
	    }
	    
	    int max = firstKsum;
	    
	    for (int i = min; i < n; i++) {
	        
	        firstKsum -= arr[i - min];
	        firstKsum += arr[i];
	        
	        max = (firstKsum > max) ? firstKsum : max;
	    }
	    
	    return max;
	}
}
