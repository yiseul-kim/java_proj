package Chapter07.ex03;

import java.text.DecimalFormat;

class Product {
	// 생성자 오버로딩을 통해 필드의 갯수에 따라서 생성자를 생성 : 5개 생성자 (기본 생성자 ... )
	// 객체 자체를 출력시 그 객체에 필드의 내용을 출력
	
	// 기본 생성자 
	public Product () {}
	
	//생성자 : 1개
	public Product(String proName) {
		this.proName = proName;
	}
	
	//생성자 : 2개
	public Product(String proName, int proNo) {
		this.proName = proName;
		this.proNo = proNo;
	}
	
	//생성자 : 3개 
	public Product(String proName, int proNo, int proPrice) {
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
	}
	
	//생성자 : 4개 
	public Product(String proName, int proNo, int proPrice, int proCount) {
		super();
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}
	
	//필드 : 속성
	String proName ; 	//제품 이름
	int proNo ; 		//제품 번호
	int proPrice ;		//제품 가격
	int proCount ;		//제품 수량
	
	
	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proNo=" + proNo + ", proPrice=" + proPrice + ", proCount=" + proCount
				+ "]";
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		
		//객체 생성
		Product p1 = new Product();
		Product p2 = new Product("김치냉장고");
		Product p3 = new Product("전자레인지",100);
		Product p4 = new Product("냉장고", 200, 270000);
		Product p5 = new Product("컴퓨터", 300, 1000000, 200);
		
		// 값 출력
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}
}
