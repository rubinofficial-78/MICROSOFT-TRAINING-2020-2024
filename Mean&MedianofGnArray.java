import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i = 0 ; i < size ; i++){
		    arr[i] = scan.nextInt();
		}
		double mean;
		int sum = 0;
		for(int i = 0 ; i < size ; i++){
		    sum += arr[i];
		}
		mean = (double)sum/(double)size;
		double median;
		Arrays.sort(arr);
		if(size%2 != 0){
		    median = (double)arr[size/2];
		}
		median = (double)(arr[(size - 1) / 2] + arr[size / 2]) / 2.0;
		System.out.println("The mean is "+mean+"\nThe median is "+median);
	}
}
