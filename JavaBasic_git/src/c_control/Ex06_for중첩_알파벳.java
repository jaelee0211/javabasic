package c_control;

public class Ex06_for중첩_알파벳 {

	public static void main(String[] args) {
		
//	
//		for(int i=0 ; i<26 ; i++) {  //26줄
//		
//		for(char ch='A'; ch<='A'+i ; ch++) { //알파벳출력
//			System.out.print(ch);
//		
//		}
//		System.out.println();
//	}

		for(int i=0 ; i<26 ; i++) {  //26줄
		
		for(char ch=(char)('A'+i); ch<='Z' ; ch++) { //카페 예제4
			System.out.print(ch);
		
		}
		System.out.println();
	}
	}		
}
