package Inher;
import java.util.*;

public class Employee1 {
	
	int basicpay;
	int deduction;
	int bonus;

	public void getDetails() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic pay");
		 basicpay = sc.nextInt();
		System.out.println("Enter the deduction");
		 deduction = sc.nextInt();
		System.out.println("Enter the bonus");
		 bonus = sc.nextInt();
		
	}
	
}
