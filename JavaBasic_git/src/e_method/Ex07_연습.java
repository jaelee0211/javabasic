package e_method;

import java.util.Scanner;

public class Ex07_연습 {
	
	public static void main(String[] args) {
		int [] score = input();         //인자확인
		double avg = calculate(score);  //
		output(avg);
	}
	
	//국영수 점수를 입력하기
	static int [] input() {
		
		int [] score = new int[3];    //인자 입력
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수->");
		score [0] = input.nextInt();
		System.out.println("영어점수->");
		score [1] = input.nextInt();
		System.out.println("수학점수->");
		score [2] = input.nextInt();
	
	    return score;        //    calculate반환
	}
	
	//입력받은 점수들로 총점/평균 구해서 출력
	static double calculate(int[] score) {
		int total =0;
		double avg = 0.0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		avg = total / (double)3;
		System.out.println("총점:"+ total +", 평균:"+ avg);
//		total = score[0]+ score[1]+ score[2];

		return avg;
	}
	
	//평균값을 받아서 학점을 구하여 출력
	static void output(double avg) {
		switch((int) avg/10) {
		case 10:
		case 9:System.out.println("A학점"); break;
		case 8: System.out.println("B학점");break;
		default:System.out.println("F학점");
		}
	}

}
