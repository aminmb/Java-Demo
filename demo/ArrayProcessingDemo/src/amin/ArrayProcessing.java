package amin;

import java.util.Arrays;

public class ArrayProcessing {

	public static void main(String[] args) {
		System.out.println("\nExample 1, Print the value by index");
		int[] A1 = { 2, 8, 4, 3, 1, 9, 0, 7, 5 };
		System.out.println("The value of the 5th element is " + A1[5]);

		
		// Print the Array Values
		System.out.println("\nExample 2, Print the array values. (Each value in each line)");
		for (int i=0; i< A1.length; i++){
			System.out.println("The "+ i +" th element is " + A1[i]);
		}
		
		// create an array with random values
		System.out.println ("\nExample 3, create an array with random values. (Between 1 and 10.)");
		double[] A2 = new double [10];
		for (int i=0; i<A2.length; i++){
			A2[i]= Math.floor (Math.random()*10);
		}
		System.out.println ("The random Array is " + Arrays.toString(A2));

		
		// find the maximum
		System.out.println ("\nExample 4, Find the maximum between elements and print the index");
		int index = 0;
		double[] A3 = A2;
		double max = A3[0];
		for (int i=0; i< A3.length; i++){
			if (A3[i]> max){
				max = A3[i];
				index = i;
			}
		}
		System.out.println ("The maximum is " + max + " and the index is "+ index);	
		
		
		// find the average
		System.out.println ("\nExample 5, find the average of elements");
		double sum = 0;
		for (int i = 0; i< A2.length; i++){
			sum = A2[i]+ sum;
		}
		double avg = sum / A2.length;
		System.out.println ("The average is " + avg + " , while the sum of elements is " + sum );
				
		
		//reverse the array
		System.out.println ("\nExample 6, Reverse the array");
		double[] A6 = A2;
		System.out.println ("The Original Array is " + Arrays.toString(A6));
		int size = A6.length;
		double[] reversedArray = new double[size];
		for (int i=0; i<size; i++){
			reversedArray[i] = A6[size-1-i];
		}
		System.out.println ("The reversed Array is " + Arrays.toString(reversedArray));
		
		
		//insert an element
		System.out.println ("\nExample 7, insert a new element (add 9 to the 6th element)");
		double[] A7 = A2;
		double[] insertedArray = new double[A2.length+1];
		double newElement = 9.0;
		int insertedIndex = 6;
		System.out.println ("The Original Array is " + Arrays.toString(A7));
		for (int i=0; i<A7.length+1; i++){
			if (i<insertedIndex){
				insertedArray[i]=A7[i];
			} else if (i==insertedIndex){
				insertedArray[insertedIndex]=newElement;
			} else{
				insertedArray[i]=A7[i-1];
			}	
		}
		System.out.println ("The new Array after insertion is " + Arrays.toString(insertedArray));
		
		
		//delete an item
		System.out.println ("\nExample 8, delete an element (the 6th element)");
		double[] A8 = A2;
		double[] deletedArray = new double[A2.length-1];
		int deleteIndex = 6;
		System.out.println ("The Original Array is " + Arrays.toString(A8));
		for (int i=0; i<A8.length-1; i++){
			if (i<deleteIndex){
				deletedArray[i]=A8[i];
			} else{
				deletedArray[i]=A7[i+1];
			}	
		}
		System.out.println ("The new Array after deletion is " + Arrays.toString(deletedArray));
		
		//search for the value
		System.out.println ("\nExample 9, search for the value, count the elements");
		System.out.println ("The repeat index is");

		double[] A9 = A2;
		System.out.println ("The Original Array is " + Arrays.toString(A8));
		double[] elementArray = new double [A9.length];
		int count = 0;
		double element = 6.0;
		for (int i=0; i< A9.length; i++){
			if (A9[i]==element){
				count++;
				elementArray[i]=A9[i];
				System.out.print(" " + i + ",");
			}
		}
		System.out.println ("\nThe number of repeats is " + count);
		System.out.println ("The Array only includes repeats is " + Arrays.toString(elementArray));


	}

}
