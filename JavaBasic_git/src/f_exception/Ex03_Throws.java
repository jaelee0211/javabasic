package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {
	
	public static void main(String[] args) {
		try {
		readFile();
		System.out.println("파일처리성공");
		}catch (Exception ex) {
			System.out.println("에외발생"+ ex.getMessage());
			//ex.printStackTrace();
		}
	}
	
	static void readFile() throws Exception{   //throws으로 인해 .close 다음에 catch를 쓸 필요없음
		FileInputStream fis= null;
		try {
		fis = new FileInputStream("happy.txt");
		}finally{
			fis.close();
		}
		}

}
