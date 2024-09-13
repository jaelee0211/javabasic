package b_operator;

import java.util.Scanner;

public class Ex03_산술 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int a,b,c ;
		System.out.print("첫번쨰숫자입력:");
		a=input.nextInt();
		System.out.print("두번째숫자입력:");
		b=input.nextInt();
		 
		  c=a+b;
		System.out.println("a+b="+c );
		 
		   c= a-b;
		System.out.println("a-b="+c);
		   c= a*b;
				   System.out.println("a*b="+c );
		   c= a/b;
				   System.out.println("a/b="+c);
		   c= a%b;
		   System.out.println("a%b=" + c);
		   
		   
		
		

		
		
	}

}
/*
 * [콘솔창에서]
 * 
 *  첫번째숫자입력 -> (ex)20
 *  두번쨰숫자입력 -> (ex) 15
 *  
 *  더하기 :35
 *  빼기 :5
 *  곱하기:300
 *  나누기:1
 *  나머지는 5
 */
 