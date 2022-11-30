import java.io.*;
import java.net.*;

import com.itwill.shop.*;
import com.itwill.shop.member.*;
import com.itwill.shop.product.*;

/* 
import java.lang.*;
java.lang package에 있는 클래스 import구문 생략가능
 */
public class JavaClassImportMain {

	public static void main(String[] args) {
		System.out.println("===========java.lang package=========");
		java.lang.String str1 = "임포트";
		String str2 = "김경호";
		System.out.println(Math.random());
		
		InputStream in;
		OutputStream out;
		Socket soket;
		
		ShopService shopService;
		Member m;
		Product p;
		
	}

}
