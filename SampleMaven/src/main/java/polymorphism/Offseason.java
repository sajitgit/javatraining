package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason {
	
	float offseasondiscount;
	public void discount(int pitem1,int pitem2) {
		
		
		offseasondiscount = (pitem1+pitem2)*0.15f;
		System.out.println("Offseasondiscount is"+offseasondiscount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the season");
		String season = sc.next();
		System.out.println("Enter the price of item 1");
		int p1 = sc.nextInt();
		System.out.println("Enter the price of item 2");
		int p2 = sc.nextInt();
		Offseason obj1 = new Offseason();
		Onseason obj2 = new Onseason();
		
		
		
		if(season.equals("Offseason")) {
			
			obj1.discount(p1, p2);
			
		}
		
		else if(season.equals("Onseason")) {
			
			obj2.discount(p1, p2);
		}
		
		else {
			
			System.out.println("Invalid input");
		}
		
		
		
	}

}
