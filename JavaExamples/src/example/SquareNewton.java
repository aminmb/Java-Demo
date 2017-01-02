package example;

public class SquareNewton {
		
		public static void main(String[] args){
			
			double rootSquare = 1.0;
			double epsilon = 0.001;
			double x= 2.0;
			
			while (Math.abs(rootSquare*rootSquare - x) > epsilon){
				rootSquare = (x/rootSquare + rootSquare) /2;
				
			}
			
			System.out.println(rootSquare);
		}
}