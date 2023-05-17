package Chapter07.ex04;

class Book {
	
	//기본 생성자를 호출시 필드의 초기값 셋팅
	Book() {
		bookName = "책이름 알수 없음";
		bookAuthor = "작자 미상";
		bookPrice = 0;
		bookCount = 0;
	}
	
	// 매개변수가 1개 인풋 : bookName
	Book(String bookName) {
		this(); 					// book의 기본 생성자를 호출 : 값을 입력하지 않은 곳에 기본값이 들어감 //this() : 생성자내부에서 다른 생성자 호출
		this.bookName = bookName;	// this 키웓 : 필드명, 메소드명
	}
	// 매개변수 2개 생성자 호출 
	Book(String bookName, String bookAuthor) {
		this(bookName);			//바로 위의 book을 호출
		this.bookAuthor = bookAuthor;
	}
	// 매개변수 3개 생성자 호출  
	Book(String bookName, String bookAuthor, int bookPrice) {
		this(bookName, bookAuthor);			//바로 위의 bookName을 호출
		this.bookPrice = bookPrice;
	}
	// 매개변수 4개 생성자 호출  
	Book(String bookName, String bookAuthor, int bookPrice, int bookCount) {
		this(bookName, bookAuthor, bookPrice);			//바로 위의 bookName을 호출
		this.bookCount = bookCount;
	}
	
	
	//field
	String bookName;
	String bookAuthor;
	int bookPrice;
	int bookCount;
	
	
	// 필드의 값을 모든값을 출력 
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + ", bookCount="
				+ bookCount + "]";
	}
	
	
	
}

public class This_Method02 {

	public static void main(String[] args) {
		// Book 객체 생성
		Book b1 = new Book();
		Book b2 = new Book("홍길동전");
		Book b3 = new Book("자바","이순신");
		Book b4 = new Book("파이썬","김유신", 30000);
		Book b5 = new Book("html","신사임당", 40000,500);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

	}

}
