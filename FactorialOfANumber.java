import java.util.*;
public class Main
{
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		System.out.println("Enter the Number :");
		N = scan.nextInt();
		System.out.println("The factroial of the given number "+N+" is "+fact(N));
	}
}
