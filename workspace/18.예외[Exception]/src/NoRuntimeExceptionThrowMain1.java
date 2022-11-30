import java.io.*;
import java.net.*;
import java.sql.*;

public class NoRuntimeExceptionThrowMain1 {

	public static void main(String[] args) throws Exception/* throws IOException, ClassNotFoundException,SQLException ,RuntimeException */{
		
		System.out.println("stmt1");
		/*
		 * 예외발생예상코드(IOException)
		 */
		Socket socket = new Socket("wwww.daum.net",80);
		
		System.out.println("stmt2");
		/*
		 * 예외발생예상코드(ClassNotFoundException)
		 */
		Class.forName("AClass");
		System.out.println("stmt3");
		
		/*
		 * 예외발생예상코드(SQLException)
		 */
		//DriverManager.getConnection("");
		
		/*
		 * 예외발생예상코드(ArithmeticException)
		 */
		int result = 3/0;
		
	}

}
