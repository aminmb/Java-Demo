package example;
import java.util.*;

public class SquareNewtonFunctional {
	
	
	public static double abs(double num){
		
		double absNum;
		if (num < 0) {
			absNum = -num;
		} else {
			absNum = num;
		}
		
		return absNum;
	}
	
	
	public static boolean isGoodEnough(double x, double guess){
	
		double epsilon = 1e-12;
		// System.out.println("isGoodEnough - absError: " + abs(guess * guess - x));
		if (abs(guess * guess - x) < epsilon){
			//System.out.println("isGoodEnough " + true);
			return true;
		}
		//System.out.println("isGoodEnough " + false);
		return false;
	}

	
	public static double improve(double x, double guess ){
		
		guess = (x/guess + guess) /2;
		//System.out.println("improve- new guess is " + guess);
		return guess;
	}
	
	
	public static double sqrtItr(double x, double guess){
		
		while (!isGoodEnough(x, guess)){
			//System.out.println("sqrtItr- improved" + guess);
			guess = improve(x,guess);
			
		}
		//System.out.println("Not needed to get improve -" + guess);
		return guess;
	}
	
	
	public static double sqrt(double x, double guess){
		
		// double guess = 1.0;
		// System.out.println("sqrt- " + sqrtItr(x,guess));
		return sqrtItr(x, guess);
	}
	
	
	public static void main(String[] args){
		
		//double x = 16.0;
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a number to calculate its square root: ");
	    double x = scanner.nextDouble();
		double guess = 1.0;
		//System.out.println("x is " + x);
		//System.out.println("initial guess is: " + guess);
		double r = sqrt(x,guess);
		System.out.println("The square root of " + x + " is " + r);
	}
	
}
