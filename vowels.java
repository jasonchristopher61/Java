import java.util.*;

public class vowels {
	String s1;
	
	public void getInput(){
    
      
       
       
    
	}
	public void chec() {
		Scanner in = new Scanner(System.in);  
	    System.out.println("Enter a letter");
	    s1=in.next();
		for(int i=0;i<s1.length();i++) {
		
		boolean vowels = s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'
	               || s1.charAt(i)=='o' || s1.charAt(i)=='u';
		if(vowels) {
			System.out.println("Vowel");
			
			
		
	}
		
		else if(Character.isDigit(s1.charAt(i))){
			System.out.println("Not an Alphabet");
			
		}
		else {
			System.out.println("Consonent");
		}
		}

}
	public static void main(String a[]) {
		vowels v=new vowels();
		v.getInput();
		v.chec();
		
	}
}
