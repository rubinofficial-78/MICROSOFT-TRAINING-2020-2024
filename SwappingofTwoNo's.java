import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the first No:");
		a = scan.nextInt();
		System.out.println("Enter the second No:");
		b = scan.nextInt();
		System.out.println("The values of a and b before swapping is a = "+a+" and b = "+b);
		//Swapping the two no's without third variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The values of a and b after swapping is a = "+a+" and b = "+b);
	}
}
