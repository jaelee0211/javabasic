package e_method;

import java.util.Scanner;
public class Ex99_복습2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력->");
		int jumsu = input.nextInt();
		
		
		String result = pass(jumsu);
		//합격여부 출력
	    System.out.println("결과:"+ result);
	}
	/*
	 * 역할:입력받은 점수를 넘겨받아서
	 *     80점이상이면 '합격' 그렇지 않으면 '불합격'출력
	 */
	static String pass(int jumsu){
		String result = "";
	   if(jumsu >=80) result = "합격";
	   else result="불합격";	   
	   //System.out.println(result);
	   
	   return result;
	}

}
