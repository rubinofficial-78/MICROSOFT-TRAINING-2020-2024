import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		System.out.println("Enter the size of the array:");
		N = scan.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter the elements in the array:");
		for(int index = 0 ; index < N ; index++){
		    arr[index] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The second Maximum element is "+arr[N-2]);
	}
}
