/*
 Enter your code here. Read input from STDIN. Print output to STDOUT
 Your class should be named Solution
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Solution {

  /**
	 * @param args
	 * @throws IOException 
	 */
private static int k=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		String inp;
		int n;
		//int k;
		//double balance;
		inp=a.readLine();
		StringTokenizer st = new StringTokenizer(inp);
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		String inp2;
		inp2=a.readLine();
		StringTokenizer st2 = new StringTokenizer(inp2);
		int[] numbers= new int[n];
		//int d=0;
		int count=0;
		for (int i=0;i<n;i++){
			numbers[i]=Integer.parseInt(st2.nextToken());
			//System.out.println(numbers[i]);
		}
		Arrays.sort(numbers);
		for (int i=0;i<n;i++){
			
			 count += binaryLeft(0, i - 1, numbers, i);
		     count += binaryRight(i + 1, n - 1, numbers, i);
			
		}
	System.out.println(count/2);
	}
	   private static int binaryLeft(int low, int high, int[] array, int index) {
		   while (low <= high) {
		       int mid = (low + high) / 2;
		       if (array[mid] + k == array[index]) {
		    // System.out.println("" + array[index] + " " + array[mid]);
		    return 1;
		       } else if (array[mid] + k < array[index])
		    low = mid + 1;
		       else
		    high = mid - 1;
		   }
		   return 0;
		      }

		      private static int binaryRight(int low, int high, int[] array, int index) {
		   while (low <= high) {
		       int mid = (low + high) / 2;
		       if (array[mid] - k == array[index]) {
		    // System.out.println("" + array[index] + " " + array[mid]);
		    return 1;
		       } else if (array[mid] - k < array[index])
		    low = mid + 1;
		       else
		    high = mid - 1;
		   }
		   return 0;
		      }

}
