package e_method;

/*
 * call by value: 메스드의 인자(파라메터)가 기본형인 경우
 * 
 * =>값만 복사
 */
public class Ex06_CallByValue {
	
	public static void main(String[] args) {
		
		int a= 10,b=20;
		add(a, b);
		System.out.println("2. A="+ a+ ", B="+ b);
	}
	
	static void add( int a, int b) {
		a +=b;//a=a+b;
		System.out.println("1. A="+ a+ ", B="+ b);// 다시 올라가면 값이 사라짐
	}

}
