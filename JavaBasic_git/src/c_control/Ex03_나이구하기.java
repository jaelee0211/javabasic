package c_control;


import java.util.Calendar;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
//		
//		String id = "970211-1111111"; //문자형
//		
//		String sal = id.substring(0,2); //sal="97"
//		int susal = Integer.parseInt(sal); //"80"->80 문자형에서 숫자형으로 형변환 
//		                                   //int를 String으로 형변환(문자열"97"-> int형 80
//		
//		int age = 0;//초기화
//		
//		age = 2024 - (1900+ susal)+1;
//		System.out.println("한국나이="+ age);
//		
		
		
		//올해년도 구하기
		Calendar cal = Calendar.getInstance();//Local.date().getYear();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);

		String id = "010101-4111111"; //문자형
		
		String sal = id.substring(0,2); //sal="97"
		int susal = Integer.parseInt(sal); //"80"->80 문자형에서 숫자형으로 형변환 
		 //int를 String으로 형변환(문자열"97"-> int형 80
		
		int age = 0;//초기화
		//성별문자가'1'이거나'2'라면
		char nai = id.charAt(7);
		if(nai == '1'|nai== '2');{
		age = year - (1900+ susal)+1;
		}//성별문자가'3이거나 '4'라면
		if(nai=='3'|nai=='4') {
		age = year - (2000+ susal)+1;
		}
		                                   //위쪽의 방식에서 else if로 바꾸는게 더 깔끔?
		System.out.println("한국나이="+ age);
			
		
		
		
	}
}

/*
 * Wrapper class : 자료형 클래스
 * 
 * int  : Integer
 * long : Long
 * double : Double
 * 
 */

