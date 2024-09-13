package 연습장;

public class 연습 {

	public static void main(String[] args) {
		
		int su1 = 51;    //변수선언
		String str = "50미만"; //String str; 이렇게 하면 오류가 발생한다.\
		                     //String형 변수 str을 선언하면서 "50미만"이라는 문자열을 대입한다.
		                     //이는 사실 기본자료형이 아니라 객체 자료형이다.
		                     //;;단지 문자열을 저장할때는 String형 변수에 넣는다것만 기억
		if(su1>=50)
			str= "50 이상";
		System.out.println(str+ "입니다.");
	}
}
