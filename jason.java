import java.util.*;
public class jason {
	
	public static void main(String a[]) {
		 int r,sum=0,temp,n,res=0;    
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  

	      n=in.nextInt();

		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   if(r%2==0) {
			   res=res+r;
			   
		   }
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) {   
			  
		   
		  
			   System.out.println("The sum is"+ res);
			   System.out.println("palindrome number "); 
		   
		  }
		  else    {
		   System.out.println("not palindrome");    
		}
		  if(res>25) {
			  System.out.println("Success");
		  }
		  else {
			  System.out.println("Failure");
		  }
		
	
	
	}
}


