package javaExercise;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
            double a =0;
		Scanner  sc = new Scanner(System.in);
	     System.out.print("how many elements ; ");
	     int j = sc.nextInt();
	     double [] arr = new double[j];
	     for(int i=0;i<j;i++) {
	     System.out.print("array element "+i +" is ; ");
	     arr[i] = sc.nextDouble();
	    
	    	 a+=arr[i];
	     }
	     sc.close();
	     System.out.println("addition of all array element are = "+a);
    System.out.println("average of array element are = "+(a/j));
	}

}
