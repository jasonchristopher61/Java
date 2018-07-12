import java.util.*;

public class london {
	
	public static void main(String a[] ){
		String s5;
		Scanner input= new Scanner(System.in);
	    System.out.println("Enter the String");
	    s5=input.next();
	    char[] ch=s5.toCharArray();
	     for(int i=ch.length-1;i>=0;i--) {
	    	 System.out.print(ch[i]);
	     }
		
	    
		
	}

}
