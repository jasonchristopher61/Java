import java.util.*;

public class game {
	public static void main(String args[]) {
        int num,target;
        System.out.println("Enter a number(between 1 and 50):");
        Scanner ip=new Scanner(System.in);
        target=ip.nextInt();
        do {
           
        num=ip.nextInt();
        if(num>=1&&num<=50) 
        {
            if(num>target)
            {
                System.out.println("your number is greater than target");
            }
            else if(num<target)
            {
                System.out.println("your number is less than target");

            }
            else {
            	System.out.println("Target Matched");
            }
        }
        else {
           System.out.println("Please enter number between 1 and 50");

        }
        }while(num!=target);
        }
}
