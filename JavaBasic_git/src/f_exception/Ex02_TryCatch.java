package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_TryCatch {

	public static void main(String []args) {
		FileInputStream fis = null;
		
	try {	
		fis= new FileInputStream("abc.txt");
		fis.read();
		System.out.println("파일처리");
	}catch(FileNotFoundException ex) {
		System.out.println("파일이 존재하지 않는 예외발생:"+ ex.getMessage());
	}catch(Exception ex) {
		System.out.println("그 외 예외발생:"+ ex.getMessage());	
	}finally {
		try {
		fis.close();
		}catch(Exception ex) {}
	}
}
}