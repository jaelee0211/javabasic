package c_control;

import java.util.Scanner;

public class Ex06_for복습 {

	 public static void main(String[] args) {
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("입력");
		 
		 int a= sc.nextInt();
		 
		 for(int b=0; b<a ; b++) {
			 // 공백 추가
			 for(int col=0;col< a-b-1 ; col++) {
				 System.out.print(" ");
			 }
			 
			 for(int j=1; j <= b+1 ; j++){//문자(열:column)
				 System.out.print(j);
		 }
			System.out.println();
		 }
		 
	 }
}
