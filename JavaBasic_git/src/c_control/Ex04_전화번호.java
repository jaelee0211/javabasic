package c_control;

/*
 * 콘솔로 전화번호 입력받아서
 * 지역번호를 추출하여
 * swtich 문장을 이용하여 지역이름을 출력
 * ex) 02 : 서울
 *     032: 인천
 *     031: 경기
 *     064: 제주
 *     나머니지 :한국
 * 
 * 
 */

public class Ex04_전화번호 {

	public static void main(String[] args) {
		
		
		String call = "02-333-3333";  //String변수 call에 값 대입
		int idx =call.indexOf('-');   //변수int
		String localNum= call.substring(0,idx);
		
		
		String local="";
		switch(localNum) {
		case"02" : local = "서울" ; break;
		case"032": local = "인천" ; break;
		case"031": local = "경기" ; break;
		case"064": local = "제주" ; break;
		default  : local = "나머지";
		}
		System.out.println("당신의 지역은 " + local + "입니다.");
		
		
	}
}
