import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Scanner in = new Scanner(System.in);
        String a = in.next();
        char temp;
		
		char[] ar = new char[a.length()];
		for(int c = 0; c < a.length(); c++){
			 ar[c] = a.charAt(c);
		}
		for(int c = 0; c<a.length(); c++){
			 for(int d = c +1; d<a.length(); d++){
			if(ar[c] > ar[d]){
			     temp = ar[c];
				 ar[c] = ar[d];
				 ar[d] = temp;
			} 
		
			 
		}
		}
        for(int c = 0; c<a.length(); c++){
			 System.out.print(ar[c]);
		}
	}
}
