import java.util.*;

public class last {

	public static void main(String a[] ){
		String s6;
		int num,x,y,i;
		Scanner input= new Scanner(System.in);
	    System.out.println("Enter the String and a number");
	    s6=input.next();
	    num=input.nextInt();
	    
	    x=s6.length();
	    y=x-num;
	    for(i=0;i<x;i++)
	    {
	        System.out.print(s6.charAt(i));
	        
	    }
	    for(i=y;i<x;i++) {
	        int j=y;
	        while(j<x) {
	            System.out.print(s6.charAt(j));
	            j++;
	    

}
}
	}
}
