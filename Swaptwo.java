import java.util.*;
public class Swaptwo{

	public static void main(String[] args) {
		int a =7;
		int b =9;
		System.out.println("Before swapping value of a = " +a +" and b =" +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping value of a = " +a +" and b = " +b);
	}
}