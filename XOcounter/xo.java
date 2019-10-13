import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int o = 0,x = 0;

		Scanner in = new Scanner(System.in);
        String a = in.next();
		
		for(int c = 0; c < a.length(); c++){
			 
			 if(a.charAt(c) == 'o' || a.charAt(c) =='O'){
				  
				  o += 1;
			 }
			
			 
			 else if(a.charAt(c) == 'x' || a.charAt(c) =='X'){
			
				  x += 1;
				  
				  
			 }
			 
		}
		System.out.println("x = " + x);
		System.out.println("o = " + o);
		
	}
}
