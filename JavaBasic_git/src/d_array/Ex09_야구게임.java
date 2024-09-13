package d_array;


import java.util.*;
import java.util.StringTokenizer;
public class Ex09_야구게임 {

	public static void main(String[] args) {

		int[]baseball = new int[3];

		for(int i = 0; i< baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10);//랜덤으로 숫자 추출(0~9)
			for(int j=0; j<i;j++) {
				if(baseball[j] == baseball[i]) {
					i--;
				}
			}

			System.out.println(baseball[i]+ "/");			
		}
		for(int i= 0; i<baseball.length;i++) {
			System.out.print(baseball[i]+" ");
		}
		/*
		 * 2.사용자 입력값 answer에 각각의 숫자로 저장
		 * [ex] 345
		 */

		int[] answer=new int[3];
		
		int strike = 0;
		int ball = 0;
				//구문작성

		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력(1 2 3)->");
		StringTokenizer input_str= input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);
		//answer 값 출력
		for(int i = 0;i<answer.length;i++) {
			answer[i]= Integer.parseInt(st.nextToken());
		}
		//3.값비교
		for(int i= 0; i<baseball.length;i++) {
			for(int j=0; j<answer.length;j++) {
				if(baseball[i]==answer[j]) {
					if(i==j) strike++;
					else ball++;
				}
			}
		}
		//4.출력
		System.out.println("스트라이크:"+ strike+"/볼:"+ ball);






	}
}



