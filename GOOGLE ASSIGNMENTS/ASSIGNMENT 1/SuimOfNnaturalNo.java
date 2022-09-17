import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		int sum = 0;
		for(int index = 1 ; index < N ; index++){
		    sum += index;
		}
		System.out.println("The sum of first "+N+" is "+sum);
	}
}
