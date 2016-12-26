package amin;

public class ArrayProcessing {

	public static void main(String[] args) {
		System.out.println("\nExample 1, Print the value by index");
		int[] A1 = { 2, 8, 4, 3, 1, 9, 0, 7, 5 };
		System.out.println("The element is " + A1[5]);

		
		// Print the Array Values
		System.out.println("\nExample 2, Print the array values. (Each value in each line)");
		for (int i=0; i< A1.length; i++){
			System.out.println("The "+ i +" th element is " + A1[i]);
		}
		
		// create an array with random values
		System.out.println("\nExample 3, create an array with random values. (From 1 to 10.)");
		double[] A2 = new double [10];
		for (int i=0; i<A2.length; i++){
			A2[i]= Math.floor (Math.random()*10);
			System.out.println (i + " th index of A2 is " + A2[i]);
		}
		
		// find the maximum
		System.out.println("\nExample 4, Find the maximum between elements and print the index");
		int index = 0;
		double[] A3 = A2;
		double max = A3[0];

		for (int i=0; i< A3.length; i++){
			if (A3[i]> max){
				max = A3[i];
				index = i;
			}
		}
		System.out.println("The maximum is " + max + " and the index is "+ index);	
		
		
		// find the average
		System.out.println("\nExample 5, find the average of elements");
		double sum = 0;
		for (int i = 0; i< A2.length; i++){
			sum = A2[i]+ sum;
		}
		double avg = sum / A2.length;
		System.out.println("The average is " + avg + " , while the sum of elements is " + sum );
				
		
		//reverse the array
		System.out.println("\nReverse the array");
		double[] A4 = A2;
		for (int i=0; i<A4.length; i++){
			A4[i] = A4[A4.length-i-1];
			System.out.println("The " + i + " th value of the reversed array is "+ A4[i]);
		}
	}

}
