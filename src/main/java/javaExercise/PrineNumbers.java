package javaExercise;
import java.util.Scanner;
public class PrineNumbers {
   
	public static Boolean checkPrime(int num) {
    	
    	   boolean isPrime = true;
    	   for(int i =2 ;i<num;i++) {
    		   if(num % i ==0) {
    		  isPrime = false;
    		 return isPrime;
    		   }
    	   }
    	   return isPrime;
       }
     public static void primes(int number) {
    	   
    	   int num =2;
    	   int initial =1;
    	   while(initial <= number) {
    		   if(checkPrime(num)) {
    			 
    			   System.out.println(num);
    			   initial++;
    		   }
    		   num++;
    	   }
	}
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("how many nnumbers of prime ; ");
    	   int num = sc.nextInt();
		primes(num);
	}
}
