package example;

public class SquareNewtonWithFunction {
	
	
	public static double sqrt(double x){
		
		double rootSquare = 1.0;
		double epsilon = 1e-12;
		
		while (Math.abs(rootSquare*rootSquare - x) > epsilon){
			rootSquare = (x/rootSquare + rootSquare) /2;
			
		}
		
		return rootSquare;
	}
	
	
	public static void main(String[] args){
		
		double x = 9.0;
		double y = sqrt(x);
		System.out.println("The root is " + y);
	}
	
	
}
