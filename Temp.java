
import java.util.*;

public class Temp{
	public static void main(String[] args) {
		
		int a,b,temp;
	   System.out.println("Enter two numbers to be swapped");
       Scanner sc = new Scanner(System.in);
		a = sc.nextInt();  
        b = sc.nextInt();  
       System.out.println("before swapping numbers: "+a +"  "+ b);  
       temp = a;  
       a = b;  
       b = temp;  
       System.out.println("After swapping: "+a +"   " + b);  
   
	}
}