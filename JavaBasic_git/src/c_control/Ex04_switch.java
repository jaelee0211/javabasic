package c_control;

/*
 * 분기문 switch
 * 
 * [주의] break 문장 확인
 * [주의] 문자형(char)/정수형(int/long)/문자열(String)
 * 
 * 
 */

public class Ex04_switch {

	public static void main(String[] args) {
		
		String id = "970211-1234567";
		char chul = id.charAt(8); //String변수 id의 문자열중 0번째부터 시작하는 8번째 문자를 지정값으로 정함
		
		String local=""; // 변수선언을 하고 이후 변수를 사용하기전에 반드시 초기화해야함
		switch(chul) {
		case'0' : local = "서울"; break;
		case'1' : local = "인천/부산";break;
		case'2' : local = "경기"; break;
		case'9' : local = "제주"; break;
		default : local = "한국";         //마지막이라 break;사용은 알아서
		}   //8번째 의 변화에 따라 local 값이 달라진다.
		System.out.println("당신은 " + local+ "출신입니다");
	}
	
	
}

/*
 * 주민번호에서 출신지 번호가
 * 0 : 서울
 * 1 : 인천/부산
 * 2 : 경기
 * 9 : 제주
 * 나머지 : 한국
 * if(chul == '0'){
 *    서울
 * }else if(chul =='1'){
 *    인천/부산
 * }else if(chul == '2'){
 *    경기
 * }else if(chul == '9'){
 * 
 */



