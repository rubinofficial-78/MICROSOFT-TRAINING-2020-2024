import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		System.out.println("Enter the digit :");
		N = scan.nextInt();
		int arr[] = new int[50];
		int r , i = 0;
		while(N != 0){
		    r = N%10;
		    arr[i] = r;
		    i++;
		    N /= 10;
		}
		System.out.println("The elements are :-");
		for(int j = i-1 ; j >= 0 ; j--){
		    System.out.print(arr[j]+" ");
		}
	}
}
