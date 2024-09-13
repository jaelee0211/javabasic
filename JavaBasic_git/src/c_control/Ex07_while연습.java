package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while연습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력( 1 2 3 4)->");
		String str = input.nextLine(); //"1 2 3 4 "
		
		StringTokenizer st= new StringTokenizer(str);
		
//		int max = 0 ;
//		
//		while(st.hasMoreTokens()) {
//			String token= st.nextToken();
//			int su = Integer.parseInt(token);
//			if(max < su) max = su;
//			
//		}
//	           System.out.println("큰 수: "+ max);
		
		int odd=0,even=0;
		
		while(st.hasMoreTokens()) {
              String token = st.nextToken();
			  int su= Integer.parseInt(token);
              if( su%2== 1) 
				odd++;
			else even++;
			 
			}
		System.out.println("홀수="+ odd + "개");
		System.out.println("짝수="+ even+ "개");
		}
	}

