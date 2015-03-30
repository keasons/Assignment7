package edu.gatech.seclass.assignment7;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	buggyMet3();
		
	}
	

	public static void  buggyMet1(int a, int b) {
		//100% branch coverage for a= -2, 5
		//100% path coverage for a= -10, 5 and reveals fault
		
		
		if (a>0 && b>0)
			System.out.println("A > 0 and b>0 a=" + a +" b="+b ) ;
		else {
			System.out.println("a=" + a +" b="+b ) ;
			double c= a/ b ;
			System.out.println("c=" + c ) ;
		}
		
			
			
		
		return ;
	
	}

	public static void  buggyMet3() {
		//Not necessarily revealed by 100% branch
		//Revealed by 100% statement coverage (therefore should have built in divide by 0) 
		//since branch subsumes statement, not possible.
		
		

			System.out.println("not possible - buggyMet3") ;
		
		
		return ;

	}
			
	
	public static void  buggyMet2(int a, int b, int c) {
		//Not necessarily revealed by 100% branch
		//Revealed by 100% statement coverage (therefore should have built in divide by 0) 
		//since branch subsumes statement, not possible.
	
			//100% branch coverage for a= -2, 5
			//100% path coverage for a= -10, 5 and reveals fault
			
			
			if (a>0)
				System.out.println("a=" + a ) ;
			else 
				System.out.println("a=" + a ) ;
			
			if (b>0)
				System.out.println("b="+b ) ;
			else 
				System.out.println("b=" + b ) ;

			if (c>0)
				System.out.println("c="+c ) ;
			else
				System.out.println("c=" + c ) ;

	
		
			
				double d= (a+b)/ (b+c) ;
				System.out.println("(a+b)/(b+c)=" + d ) ;
			

		
		
		
		return ;

	}
				
	
		
	

	


}