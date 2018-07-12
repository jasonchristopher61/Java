import java.util.*;

public class tom {
	int num;
	public void getInput(){
	
    Scanner in = new Scanner(System.in);   
    System.out.println("Enter a number");
    num=in.nextInt();
    
    
	}
	public void oddeven() {
		  if(num%2==0 && num>20 && num<30 ) {
		    	System.out.println("Jerry");
		    }
		    if(num%2!=0 && num>20 && num<30) {
		    	System.out.println("Tom");
		    }
	}
	public static void main(String a[]) {
		tom t=new tom();
		t.getInput();
		t.oddeven();
    
    
  
	}
    
    


}
