import java.util.*;
public class MyClass
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R, C;
		R = scan.nextInt();
		C = scan.nextInt();
		int mat[][] = new int[R][C];
		for(int r = 0 ; r < R ; r++){
		    for(int c = 0 ; c < C ; c++){
		        mat[r][c] = scan.nextInt();
		    }
		}
		System.out.println("The Entered matrix is\n");
		for(int r = 0 ; r < R ; r++){
		    for(int c = 0 ; c < C ; c++){
		        System.out.print(mat[r][c]+" ");
		    }
		    System.out.println();
		}
		//Transpose of the matrix
		int transpose[][] = new int[C][R];
		for(int r = 0 ; r < R ; r++){
		    for(int c = 0 ; c < C ; c++){
		        transpose[c][r] = mat[r][c];
		    }
		}
		System.out.println("The transpose of the entered matrix is :-");
		for(int r = 0 ; r < C ; r++){
		    for(int c = 0 ; c < R ; c++){
		        System.out.print(transpose[r][c]+" ");
		    }
		    System.out.println();
		}
	}
}
