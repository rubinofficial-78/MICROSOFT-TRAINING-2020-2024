import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
     String str = scan.nextLine();
     String revStr = "";
     for(int i = str.length()-1 ; i >= 0 ; i--){
         revStr += str.charAt(i);
     }
     if(revStr.equals(str)){
         System.out.println(str+" is a palindrome");
     }else{
         System.out.println(str+" is not a palindrome");
     }
    }
}
