package com.crm.qa.testcases;
//import java.util.Scanner;
public class Test2 {
//
//	
//	public static void printNumbers(){
//    	Scanner sc = new Scanner(System.in);
//        int numb = sc.nextInt();
// 
//			  for (int i = numb+1; i <= numb+10; i++) {
//				  if (i==numb+10) {
//					 System.out.print(i);
//				}
//				  else {
//					System.out.print(i+"then ");	
//				  	}	 
//			  	}
//			  }
//	  
	
	
	public static void main(String[] args)
	    {
//	     String i="abc";
//	     String l= "def";
//	     
//	     String result= new String();
//	     
//	     
//	     int index=0
//	     
//	     while (index <i.length()) {
//			 result+= i.subSequence(index, index+1) + l.substring(index, index+1) ;
//			 index++;
//		}
//	     System.out.println(result);	     
//	     
//	     
//	    
//	    }
		
		/*int result =0;
		
		int[] numbers= {1,2,3,4,5};
		
		for(int i=0;i< numbers.length; i++){
			result  += numbers[i];
			
		}System.out.println(result);*/
		
		String data = "Fizzbuzz";
		int num =15;
		
		for (int i = 1; i <= num; i++) {
			if (i%3 ==0) {
				System.out.println("Fizz");
			}
			else if(i%5 ==0){
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
}
}