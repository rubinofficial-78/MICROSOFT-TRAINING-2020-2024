import java.util.*;
public class Main
{
    public static boolean isPerfectSquare(int X){
        if(X > 0){
            int squareRoot = (int)Math.sqrt(X);
            return ((squareRoot * squareRoot) == X);
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		if(isPerfectSquare(N)){
		    System.out.println(N+" is a perfect square");
		}else{
		    System.out.println(N+" is not a perfect square");
		}
	}
}
