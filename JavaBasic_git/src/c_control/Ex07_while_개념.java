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
 */
public class Ex07_while_개념 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		for(int i=1; i<=10 ; i++) {  //for문엔 ;; 꼭 필요
//			sum += i;
//		}
//		System.out.println("합:" + sum);
		
//		int sum = 0;
//		int i=1 ;
//		while(  i<=10  ) { //while은 for문을 나열한 수식?
//			sum += i;
//			i++;
//		}
//		System.out.println("합:" + sum);
		
		//단 수를 입력받아 구구단 출력
		Scanner input = new Scanner(System.in);
		System.out.println("단 입력->");
//		int dan = input.nextInt();
//		
//		for(int i =1; i<=9 ; i++) {
//			System.out.printf(" %d * %d= %d \n", dan, i, dan*i);
//		}                                       //f,, \n: 개행해주는 문자
//		
          int dan = input.nextInt();
          int i =1;
		  while(i<=9) {
			System.out.printf(" %d * %d= %d \n", dan, i, dan*i);
			i++;
		  }                                       //f,, \n: 개행해주는 문자
		
	}
}
