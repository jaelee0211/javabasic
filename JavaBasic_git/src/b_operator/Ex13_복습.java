package b_operator;

public class Ex13_복습 {
	public static void main(String[] args) {
		int kor=45, eng= 67, math= 77;
				int total= kor+ eng+ math;
				if(total > 150 && total< 250) {
					System.out.println("보통반입니다.");
				}
	}
	//국어45점 영어67점 수학 77점 토탈
	//총점이150보다 크고 250보다 작으면 '보통반입니다' 출력
	// if(150< total< 250)-> 이거 적용이 안됨
	

}
