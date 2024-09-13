package 연습장;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		
		System.out.println("과일명:");//Scanner클래스를 이용해 키보드로 과일명을 받을수 있게한다.
		Scanner sc = new Scanner(System.in);
		String fu = sc.next();//변수sc에 키보드에서 받은 문자열(String)을 대입한다.
		String doo; //변수만 선언
		// String 객체내용을 비교할때는 equals()메서드를 사용한다.
		if(fu.equals("포도")) {
			doo="달다";
		}else if(fu.equals("수박")) {
			doo="시원하다";
		}else if(fu.equals("딸기")) {
			doo="맛있다";
		}else 
			doo="기타";
		System.out.println(doo);
	}
}
