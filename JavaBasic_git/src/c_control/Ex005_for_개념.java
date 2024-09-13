package c_control;

public class Ex005_for_개념 {

	public static void main(String[] args) {
		/*
		 * int result=0; for(int a=1; a<=10000; a++) { result= result+ a; }
		 * System.out.println("결과:" + result);
		 *변수 result= 0일때 변수a=1이 100000 되기까지 거듭하며 1씩 증가 그 수들의 합을 출력  
		 */
//		for(char ch= 'A';ch<='Z';ch++) {
//			System.out.print(ch);
//		}
//		for(int a= 10; a>0 ; a=a-2) {
//			System.out.println(a);
//		}
//		for(char a= 'Z'; a>='A' ; a--) {
//			System.out.print(a);
//		}
		// 1일부터 10까지의 홀수의 합과 짝수의 합 구하기
		int odd = 0, even = 0;
		for (int a = 1; a <= 10; a++) {
//			if (a % 2 == 1) {       // a가 홀수일때
//				odd += a;
//				
//			} else {	            // a가 짝수일때
//				even += a;	
//			}
			
			if(a%2==1) {
			odd= odd+a;
			
			}else if(a%2==0) {
			even= even+ a;
			}
		}
		System.out.println(odd);
		System.out.println(even);
	}
}
