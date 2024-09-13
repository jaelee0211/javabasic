package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3 ;
		if( a>3 & ++a>3) {
			System.out.println("조건만족");
		}
		System.out.println("A=" + a);        //일반 논리에서 기호를 하나만 쓰는 경우
		
		int b = 3 ;
		if( b>1 | ++b>3) {
			System.out.println("조건만족2");
		}
		System.out.println("B=" + b);
	}

}
