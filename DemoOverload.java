//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 7                                    *//
//* Tutorial Task: Overload                    *//          
//**********************************************//
public class DemoOverload {

	public static void main(String[] args) {
		
		//single digit integers//
		int a = 3;
		int b = 9;
		int c = 6;
		
		//double digits chosen//
		double d = 4.17;
		double e = 9.35;
		double f = 6.27;
		
		//sum for int//
		int g = sum(a, b, c);
		//sum for double//
		double h = sum(d, e, f);
		
		//calculation for average//
		int i = average(a, b, c);
		//calculation for double average//
		double j = average(d, e, f);
		
		//calculation for square//
		int k = square(a);
		//calculation for double square//
		double l = square(a);
		
		//prints out the sum of the single integers//
		System.out.println("Sum of Int is: " + g);
		//prints out the sum of the double integers//
		System.out.println("Sum of Double is: " + h);
		
		//prints an empty line to make output clear//
		System.out.println("");
		
		//prints out the average of the single integers//
		System.out.println("Sum of Int is: " + i);
		//prints out the average of the double integers//
		System.out.println("Sum of Double is: " + j);
		
		//prints an empty line to make output clear//
		System.out.println("");
		
		//prints out square//
		System.out.println("Sum of Int is: " +k);
		//prints out double square//
		System.out.println("Sum of Double is: " + l);	
	}
	//calculation to work out sum//
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}//end of public static//
	
	//calculation to work out double sum//
	public static double sum(double d, double e, double f) {
		return d + e + f;
	}//end of public static//
	
	//calculation to work out average//
	public static int average(int a, int b, int c) {
		return sum(a, b, c)/3;
	}//end of public static//
	
	//calculation to work out double sum//
	public static double average(double d, double e, double f) {
		return (d + e + f)/3;
	}//end of public static//
	
	//calculation to work out square//
	public static int square(int a) {
		return a*a;
	}//end of public static//
	
	//calculation to work out double square//
	public static double square(double d) {
		return d*d;
	}//end of public static//
	
}//End of class//
//End of project//
