
/*
 Program to calculate discount If customer purchase clothes on  
 Offseason, set discount 15% and on Onseason 40%  
  Should use two classes, Onseason and Offseason  
  Use two methods- discount(method name should be same)

*/
package polymorphism;

public class Onseason {
	float onseasondiscount;
	
	public void discount(int pitem1,int pitem2) {
		
		onseasondiscount = (pitem1+pitem2)*0.4f;
		System.out.println("Onseason discount is"+onseasondiscount);
		
		
		
	}

}
