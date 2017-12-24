package com.crm.qa.testcases;
import java.util.Arrays;

public class Sample {


	public static void main (String[] args){
		
		
		
//	Find Smallest and largest integer from given string.
		
		/*int number[] ={-10,-20,20,19,7,674,-39};
			
			int largest = number[0];
			int smallest = number [0];
			
			for (int i =1; i< number.length; i++){
				if(number[i]>largest){
					largest = number[i];
				}
				else if (number [i]< smallest) {
					smallest = number [i];
				}
			}
			System.out.println("total number of array" + Arrays.toString(number));
			System.out.println("largest number is " + largest);
			System.out.println("Smallest number is " + smallest);
		*/
		
//		Swap two strings variables
		
		/*String a = "Hello";
			String b = "World";	
			
			a=a+b; //HelloWorld
			
			b=a.substring(0, a.length()-b.length());
			a=a.substring(b.length());
			
			System.out.println("value of a:: " + a );
			System.out.println("value of b ::" + b );
			
		*/
		
//		Swap two integer numbers without using 3rd variable.
		
		/*int a= 5;
		int b= 9;
		System.out.println("value of a ="+ a);
		System.out.println("value of b ="+ b);
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println("After convert value of a ="+ a);
		System.out.println("After convert value of b ="+ b);*/
		
//		Swap two integer numbers without using 3rd variable.
		
		/*int a= 5;
		int b= 9;
		System.out.println("value of a ="+ a);
		System.out.println("value of b ="+ b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After convert value of a ="+ a);
		System.out.println("After convert value of b ="+ b);
		*/
//		Reverse String using for loop
		
		/*String s = "Selenium";
		int length = s.length();
		String reverse = "";
		for(int i= length-1;i>=0; i--){
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
		*/
//		Reverse String using String Buffer Class.
		
		/*StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		*/
		
//		Remove Special, Junk, Unwanted characters from String.
		
		/*String s= "93275&*^(*^*(876UHJKG^Yjhguygbhgy()&)(*^*&^-90666098709q><><::";
		s= s.replaceAll("[^0-9a-zA-Z]", " ");
		System.out.println(s);
		*/	
		
//		Reverse Integer value with mathematical algorigthm and without mathematical algorithm.
		/*long num=12345;
		long rev=0;
		
		while(num !=0){
			rev = rev*10 + num %10;
			num = num/10;
		}
		System.out.println("Reverse num is :: " + rev);*/
//		Using String Buffer class
		/*int num =12345;
		StringBuffer sf = new StringBuffer(String.valueOf(num));
		System.out.println("reverse is "+sf.reverse());
		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		*/
		
//		Find missing number is array list 
		int a[]= {1,2,3,4,5,6,8,9};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum= sum+a[i];
		}
		int sum1=0;
		for (int j = 1; j <= 9; j++) {
			sum1 = sum1 + j;
		}
		System.out.println("Missing number is:: "+ (sum1-sum));
		
		
		
		
		
		
	}
	
	

}
