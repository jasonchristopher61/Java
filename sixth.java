import java.util.*;

public class sixth {
	String a;
	int i;
	public void get() {
		Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a Character");  
	      a=in.nextLine();
	     if(Character.isDigit(a.charAt(0))) {
	    	 System.out.println("It is a number");
	     }
	     else if((a.charAt(0)>=0 && a.charAt(0)<=47) || (a.charAt(0)>=58&& a.charAt(0)<=64) || (a.charAt(0)>=91 && a.charAt(0)<=96) || (a.charAt(0)>=123 && a.charAt(0)<=127)) {
	    	 System.out.println("Special Characters");
	     }
	     for(i='A';i<='Z';i++) {
	    	 if(a.charAt(0)==i) {
	    		 System.out.println("Capital");
	    	 }
	    	 
	     }
	     for(i='a';i<='z';i++) {
	    	 if(a.charAt(0)==i) {
	    		 System.out.println("Small");
	    	 }
	     }
	    
		  
	}
	
       public static void main(String a[]) {
    	   sixth s=new sixth();
    	   s.get();

       }
}
