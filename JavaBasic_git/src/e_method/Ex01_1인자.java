package e_method;

/*
 * 인자-argument
 * 매개변수- paramater
 * 
 * 인자 := 매개변수
 */
public class Ex01_1인자 {

	public static void main(String[] args) {
		//데이타
		int a= 10,b=20;
		add(a,b);//인자 :argument
		
	}
	static void add(int a,int b) {//매개변수 : parameter
		// 데이타에 대한 처리
		int sum =a + b;       //이름을 굳이 안맞춰도 되지만 안그러면 사람이 헷갈림
		System.out.println("합:"+ sum);
	}
}
