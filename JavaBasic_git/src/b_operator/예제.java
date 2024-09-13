package b_operator;

import java.util.Scanner;

public class 예제 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("첫번째 숫자입력-> ");
		int a= sc.nextInt();
		System.out.println("두번째 숫자입력->");
		int b= sc.nextInt();
		System.out.println("세번째 숫자입력->");
		int c= sc.nextInt();
		
		int max;
		max= ( a>b ) ? a:b ;
		System.out.println(max);
		int max1= (c>max) ? c:max;
		System.out.println("제일 큰수는 "+ max1);
		
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
	}

}
