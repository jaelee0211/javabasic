package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {

		String num = "2017111001";

		// 입학년도 구하기
		String yyy = num.substring(0, 4);// 0번째에서 4번째 앞까지 네자리수 지정
		// 단과 구하기
		char dan = num.charAt(4);// 0에서4번째중 4번째 문자를 dan으로 지정
		// 학과 구하기
		String department = num.substring(5, 7);// 5번째에서 7번째 앞까지 두 자리수로 학과 구하기 
		String college = "";

		if (dan == '1') { // 단과대 번호가 공대인 경우
			college = "공대";

			// 공대 내에서 학과 구분
			if (department.equals("11")) {
				department = "컴퓨터학과";

			}else if(department.equals("12")) {
				department = "소프트웨어학과";
			}else if(department.equals("13")) {
				department = "모바일학과";
			}else if(department.equals("22")) {
				department = "자바학과";
			}else if(department.equals("33")) {
				department = "서버학과";
			}
		}else if (dan == '2') { // 단과대 번호가 사회대인 경우
			college = "사회대";

			// 사회대 내에서 학과 구분
			if (department.equals("11")) {
				department = "사회학과";
			}else if(department.equals("12")) {
				department = "경영학과";
			}else if(department.equals("13")) {
				department = "경제학과";
			}
		}
		
		// 결과출력
	String result = num + "는 " + yyy + "년도에 입학한 " + college  + department+ "학생입니다.";
					System.out.println(result);
	}
}

/*
 * if (조건문){ 실행문 if(조건문){ }else if(조건문){ } }else if
 */

/*
 * 1. 입학년도 구한다. 2. 단과대 번호, 학번 구한다. 3-1. 단과대 번호가 공대인 경우 학과를 구분한다. 3-2. 단과대 번호가
 * 사회대인 경우 학과를 구분한다. 4. 출력한다.
 */