package p1;

import java.util.*;

public class Age {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		boolean status = false;
		
		try {
			if(age>15) {
				status = true;
				System.out.println("Valid age");
			}
			else {
				status = false;
				throw new AgeException(age);
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
