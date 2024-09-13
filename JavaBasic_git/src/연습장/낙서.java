package 연습장;

import java.util.Scanner;

public class 낙서 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 수 입력->");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int c = 1;
		
		for(int a=0 ; a<row ; a++) {
			for(int b=0 ; b<col ; b++)
				System.out.println( c+ " ");
			c++;
			System.out.println();
		}
		
	}
}
