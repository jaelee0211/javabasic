package e_method;

public class Ex08_연습 {
	
	public static void main(String[] args) {
		
		multiple(2,3);
		multiple(4,'ㅋ');
		multiple(2, 3, 'ㅋ');  //인자에 맞춰 호출
		
	}

	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a, char ch) {
		for(int i= 0; i<a ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	static void multiple(int n, int m, char ch) {
		for(int a=0; a<n; a++) {
			for(int b=0; b<m; b++) {
				System.out.print(ch+" ");
			}
                   System.out.println();
		}     
	}
}
