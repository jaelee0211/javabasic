package c_control;

public class Ex01_if_전화번호 {
	
	public static void main(String[] args) {
		
		String tel= "02-222-2222";
		int idx =tel.indexOf('-');// .indexOf() : 왼쪽에서 가장 첫번째 '-'을 찾아주는 함수, 
		System.out.println(idx);  //            '-'을 정수로 인식  
		String localNum= tel.substring(0,idx);//0번째부터 idx 앞에까지의 문자열
		//System.out.println(localNum);
		
		String local= "";
		if( localNum.equals("02")) {
			local="서울";
		}else if(localNum.equals("032")) {
			local="인천";
		}
		 System.out.println(local+"입니다");
	}
}
	    

/*
 * 
 *지역번호가 02 라면 "서울" 출력
 * 그렇지 않고 지역변수가 032이라면 "인천출력
 * 나머지는 "한국" 출력
 */

//선언은 나

