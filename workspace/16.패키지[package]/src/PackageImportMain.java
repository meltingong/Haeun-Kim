import com.itwill.shop.*;
import com.itwill.shop.member.*;
import com.itwill.shop.product.*;

// import com.itwill.shop.admin.Product;


public class PackageImportMain {

	public static void main(String[] args) {
		/*
		 * << 자동 import단축키 >>
		 * 	ctrl + shift + o
		 */
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		
		Member m1 = new Member();
		System.out.println(m1);
		
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		
		System.out.println("-------------------com.itwill.shop.prdouct.Product, com.itwill.shop.prdouct.ProductService----------------------------");
		Product product = new Product();
		System.out.println(product);
		
		ProductService productService= new ProductService();
		System.out.println(productService);
		
		System.out.println("-------------------com.itwill.shop.admin.Product, com.itwill.shop.admin.ProductService----------------------------");
		com.itwill.shop.admin.Product adminProduct = new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		
		com.itwill.shop.admin.ProductService adminProductService = new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		
	}

}
