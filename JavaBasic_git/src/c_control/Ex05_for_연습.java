package c_control;

import java.util.Scanner;

public class Ex05_for_연습 {

	public static void main(String[] args) {
		/*
		 * 문제 1)1~ N까지의 숫자를 다음처럼 출력하라
			1 2 3 4 5 
			6 7 8 9 10
			11 12 13 14 15
          */
		for(int a=1 ;a<=15 ; a++) {
			System.out.print(a+" " );//" "띄어쓰기
			if(a%5==0) {
				System.out.println();
			}
		}
	
				/*
				 * 문제2)  문자열처리하기 
				문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
				N이 대문자이면 문자 N부터  Z까지 출력하라 
				그 밖의 문자가 입력되면 Error 를 출력하라 
				
				입력  출력
				f       abcdef
				X       XYZ
				6       Error 
				 */
				Scanner input = new Scanner(System.in);
				System.out.println("문자 하나를 입력하세요 -> ");
				//char ch = (char)input.nextInt();
				char ch = input.next().charAt(0);
				
				//소문자인지 여부
				if( ch>='a' & ch<= 'z') {
					for( char i= 'a' ; i<=ch ; i++) {
						System.out.print(i);
					}
				}else if( ch>='A' & ch<='Z'){
				    for( char i= 'A' ; i<=ch ; i++) {
				    	System.out.print(i);
				    }
				}
				/*
				 * ​

					문제3 ) 입력받은 문자열의 뒤집어서 출력하세요		
					 [예]  입력 -> 출력
					
					  안녕 친구  -> 구친 녕안
					
					  CarpeDiem  -> meiDepraC 
					
					 [힌트] 문자열의 길이 구할 때   length() 이용
				 */
			
				String str = "안녕 친구"
				System.out.println(str.length());
			
				
                }
}	
