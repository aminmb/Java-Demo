package example;

public class SquareNewton {
		
		public static void main(String[] args){
			
			double guess = 1.0;
			double epsilon = 0.001;
			double x= 2.0;
			
			while (Math.abs(guess*guess - x) > epsilon){
				guess = (x/guess +guess) /2;
				
			}
			
			System.out.println(guess);
		}
}