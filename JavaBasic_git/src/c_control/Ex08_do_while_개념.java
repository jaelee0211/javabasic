package c_control;

import java.util.Scanner;

/*
 *  반복문
 *  -for문
 *  -while문
 *  -do~while문
 *  for(초기치;조건문;증가치){
 *       반복문장;
 *  }
 *  
 *  초기치;
 *  while(조건문){
 *     반복문장;
 *     증가치;
 *  }
 *  
 *   초기치;
 *  do{
 *  반복문장;
 *  증가치;
 *  }while(조건문)
 * 
 */

public class Ex08_do_while_개념 {

	public static void main(String[] args) {
		
//			int sum = 0;
//			int i=1;
//			do {
//				sum += i;
//				i++;
//			}while( i<=10 ); 
//			
//			System.out.println("합:" + sum);	
//		
//		
//			Scanner input = new Scanner(System.in);
//			System.out.println("단 입력->");
//			int dan = input.nextInt();
			
			int i =1;
			do {
				while( i<=9 ) {
					System.out.printf(" %d * %d= %d \n", dan, i, dan*i);
					i++;			
				}
			
			}                                      
			
	        
			
	}
}
