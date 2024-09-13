package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a =5;
		int b =7;

		System.out.println("A="+ a + ", B="+ b);
		System.out.println("A="+ a+1 + ", B="+ b+1); //[주의]
		        // A=51
		System.out.println("A="+ (a+1) + ", B="+ (b+1));//
		
		a = a + 1;
		b = b + 1;
		System.out.println("A="+ a + ", B="+ b);
		
		//증가감소연산자
		a++; // a = a + 1;
		b--; // b = b - 1;
		
		System.out.println("A="+ a + ", B="+ b);
		
		++a; // a = a + 1;
		--b; // b = b - 1;
		
		System.out.println("A="+ a + ", B="+ b);
		
		//---------------------------------
		/*
		 * ++ -> 1을 더하겠다.
		 * ++변수(변수 앞에 붙으면): 변수에 1을 먼저 더하고 해당 줄을 실행하겠다.
		 * 변수++(변수 뒤에 붙으면): 줄을 실행하고 난 뒤 1을 더하겠다.
		 */
		
		
		int z = 10, y = 10;
		int result = ++z; // z = z+1; int result = z;
		System.out.println(result);//11
		
		int result2 = y++;// int result2= y; y= y+1
		System.out.println(result2);//10
		System.out.println(y);
		
		System.out.println("Z=" + z + ", Y=" + y);//z=11,y=11
		
		System.out.println("Z=" + ++z + ", Y=" + --y); // z= 12, y=10
		System.out.println("Z=" + z++ + ", Y=" + y--); // z= 12, y=10
		System.out.println("Z=" + z + ", Y=" + y); //z=13, y=9
		
	}

}
