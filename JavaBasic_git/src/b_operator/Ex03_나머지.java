package b_operator;

import java.util.Scanner;

public class Ex03_나머지 {

	public static void main(String[] args) {
		
		//나머지 연산자 활용 : 홀/짝수 구할 때
//		int a = 10;
//		
//		if(a%2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
        //--------------------------- 
		// 숫자 하나는 입력받아 해당한는 숫자가 3의 배수인지 여부 출력
		Scanner input= new Scanner(System.in);
		 int a;
		 System.out.println("첫번째 입력");
		 a= input.nextInt();
		 if(a%3 == 0) {
			 System.out.println("3의배수");
		 }else {
			 System.out.println("응 아니야");
			 
		 }
	}

}
