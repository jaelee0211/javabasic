package a_datatype;

public class Ex05_복습 {

	public static void main(String[] args) {
		
		// 나이를 저장할 변수를 선언하고 본인의 나이를 대입한 후 출력
		
		// 본인의 키를 소숫점 포함한 데이터로 저장하고 출력
		
		//이름 저장할 변수를 선언하고 이름을 대입후 출력
		char name = '홍';
		char name2 = '길';
	    char name3 = '동';
	    
	    //************
	    //문자        : char
	    //문자열       : string (클래스-참조형)
	    String irum = "이성재";
	    System.out.println("이름은 " + irum + "입니다.");
		
		double age;
		age = 28.8;
		System.out.println("이성재 나이: "+ age + "세");
		System.out.printf("이성재 나이 %.1f 세", age);
		

	}

}
