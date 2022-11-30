import java.io.*;
import java.net.*;
import java.sql.*;

public class NoRuntimeExceptionCatchMain1 {

	public static void main(String[] args) {
		try {
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
		DriverManager.getConnection("");
		System.out.println("stmt4");
		/*
		 * 예외발생예상코드(ArithmeticException)
		 */
		int result = 3/0;
		System.out.println("stmt5");
		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println(" ClassNotFoundException : " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("main end return");
		
	}

}
