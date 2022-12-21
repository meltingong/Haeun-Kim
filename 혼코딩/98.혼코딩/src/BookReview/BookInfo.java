package BookReview;

public class BookInfo {
	private String bookTitle;	// 책제목
	private String desc; 		// 한줄평
	private String pb; 			// 출판사
	private int review;			// 평점 (5점 만점) 
	
	public BookInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public BookInfo(String bookTitle, String desc, String pb) {
		this.bookTitle = bookTitle;
		this.desc = desc;
		this.pb = pb;
	}
	
	public void print() {
		System.out.println(this.bookTitle + "\t" + this.pb + "\t" + this.desc  );
	}
	

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPb() {
		return pb;
	}

	public void setPb(String pb) {
		this.pb = pb;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}
	
	
	
	
}
