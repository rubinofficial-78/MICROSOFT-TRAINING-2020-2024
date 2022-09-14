import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("Enter the string :");
		str = scan.nextLine();
		int freq[] = new int[str.length()];
		char ch[] = str.toCharArray();
		for(int i = 0 ; i < str.length() ; i++){
		    freq[i] = 1;
		    for(int j = i+1 ; j < str.length() ; j++){
		        
		        if(ch[i] == ch[j]){
		            freq[i]++;
		            ch[i] = '0';
		        }
		    }
		}
		for(int i = 0; i < freq.length ; i++) 
		{  
            if(ch[i] != ' ' && ch[i] != '0')  
                System.out.println(ch[i] +" : " + freq[i]);  
        }
	}
}
