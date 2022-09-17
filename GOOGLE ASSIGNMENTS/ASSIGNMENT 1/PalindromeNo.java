import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		System.out.println("Enter the Number :-");
		N = scan.nextInt();
		int OriginalNo = N;
		int Rem, reversedNo = 0;
		while(N > 0){
		    Rem = N%10;
		    reversedNo = reversedNo * 10 + Rem;
		    N /= 10;
		}
		if(reversedNo == OriginalNo){
		    System.out.println("The entered number "+OriginalNo+" is a palindrome");
		}
		else{
		    System.out.println("The entered number "+OriginalNo+" is not a palindrome");
		}
	}
}
