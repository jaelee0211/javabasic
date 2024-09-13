package c_control;

import java.util.*;/*쓰면 파일안에 있는 함수 활용가능
/*
 * for문: 반복횟수가 정해져 있는 경우 주로 사용
 * while문: 반복횟수를 모를 때 주로 사용
 */

public class Ex07_while_응용 {

	public static void main(String[] args) {
		
		//예 : 국어/영어/수학 -> 90/88/70
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 수학 (90 88 70) ->");
		
		String str = sc.next();     
		
		//System.out.println(str);
		StringTokenizer st = new StringTokenizer(str); //구분자 기본값: 공백
		
		// 반복횟수 알 수 있다면
		//int cnt= st.countToken();
//		for(int i=0 ; i<cnt; i++) {
//			String token = st.nextToken();
//			System.out.println("점수" + token);
//		}
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("점수: "+ token);
					
		}
		
	}
}
