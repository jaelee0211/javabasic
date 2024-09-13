package e_method;

/*
 *call by reference:메소드의 인자(파라메터)의 자료형이 참조형인 경우 
 *
 *=>주소만 복사 원본에게 영향을 끼칠수있음
 */
public class Ex06_CallByReference {
	
	public static void main(String[] args) {
		
		StringBuffer a =new StringBuffer("안녕");
		StringBuffer b =new StringBuffer("하이");
		
		add (a,b);  //인자의 
		System.out.println("2. A="+ a+ ", B="+ b);
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("1. A="+ a+ ", B="+ b);
	}

}
