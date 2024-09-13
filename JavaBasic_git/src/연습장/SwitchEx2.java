package 연습장;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		String str ="미";  //String 변수에"미"입력(변수의 입력값에 따라 result의 결과값에 변화)
		String result;    // 변수선언 String변수 result는 선언만 된 상태
		switch(str) {
		case "수":
			result = "90 ~ 100점";
			break;
		case "우":
			result = "80 ~ 89점";
			break;
		case "미":
			result = "70 ~ 79점";
			break;
		case "양":
			result = "60 ~ 69점";
			break;
		case "가":
			result = "59점 이하";
			break;
		default:
			result = "제대로 입력하시지";
			break;
		}
		System.out.println(result);
		
	}
}
