import java.util.*;

public class numbers {
	int num,i,j;
	public void get() {
	Scanner in = new Scanner(System.in);   
    System.out.println("Enter a number");
    num=in.nextInt();
    for(i=1;i<=num;i++) {
    	for(j=1;j<=i;j++) {
    	System.out.println(+i);
    	}
    }
    	
    
	}
	public static void main(String a[]) {
		numbers n=new numbers();
		n.get();
	}
    

}
