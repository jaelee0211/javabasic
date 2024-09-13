package c_control;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		String id = "111111-1234567";
		char sung = id.charAt(7);//문자열 중 0부터 시작해서 7번째 문자를 sung으로 지정 
		//그 문자가 1이거나 3이거나 9라면 '남자'출력 
		//그 문자가 2이거나 4이거나 0이라면'여자' 출력
		String gender="";         //id안에서 변하는 sung의 수에 따라 성별을 결정
		if( sung == '1'||sung =='3'||sung =='9') {
			//System.out.println("남자");
			gender="남자";
		}else if(sung== '2'||sung=='4'||sung=='0'){
			//System.out.println("여자");
			gender= "여자";
		}
		System.out.println("당신은 "+ gender+ "입니다");
	}

}


/*
 * 
 * '1':char
 * "1":String
 * 
 */

