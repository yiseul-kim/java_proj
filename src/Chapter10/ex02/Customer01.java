package Chapter10.ex02;

// 상속 ,  캐스팅
class Customer { 			// 부모 클래스 : 고객의 정보를 담은 클래스
	String name ;  			// 고객 이름
	long customerID; 		// 고객의 아이디
	int customerPoint; 		
	
	void customInfo() {
		System.out.println("고객 이름 : "+name+", 고객 ID : "+customerID+", 고객 포인트 : "+customerPoint);
	}
}

//자식 클래스 : GoldMember, SilverMember, BronzeMember	
	// <== int goldPoint: 10점/5점/3점, 메소드 goldInfo() 골드 회원입니다.  

class goldMember extends Customer {
	int goldPoint = 10;
	void goldInfo() {
		System.out.println("골드 회원입니다. ");
	}
}
class silverMember extends Customer {
	int silverPoint = 5;
	void silverInfo() {
		System.out.println("실버 회원입니다. ");
	}
}
class bronzeMember extends Customer {
	int bronzePoint = 3;
	void bronzeInfo() {
		System.out.println("브론즈 회원입니다. ");
	}
}
public class Customer01 {		
	public static void main(String[] args) {
		// 각 객체를 생성해서 부모클래스의 필드와 메소드 접근 가능한지 확인후 업캐스팅 <==> 다운캐스팅
		Customer c1 = new Customer();
			
		System.out.println("=========== customer 객체 ==================");
		// 각 객체 필드
		c1.name="aa";
		c1.customerID= 1111;
		c1.customerPoint=267;

		c1.customInfo();
		
		System.out.println("=========== goldMember 객체 ==================");
		//gold 
		goldMember g1 = new goldMember();
		
		g1.name="gold";
		g1.customerID= 2222;
		g1.customerPoint= 300;
		
		g1.customInfo();
		g1.goldInfo();
		System.out.println("고객님의 포인트는 : "+ g1.goldPoint +"점 입니다.");
		
		System.out.println("=========== silverMember 객체 ==================");
		//Silver 
		silverMember s1 = new silverMember();
		
		s1.name="silver";
		s1.customerID= 3333;
		s1.customerPoint= 400;
		
		s1.customInfo();
		s1.silverInfo();
		System.out.println("고객님의 포인트는 : "+ s1.silverPoint +"점 입니다.");
		
		System.out.println("=========== bronzeMember 객체 ==================");
		//bronze
		bronzeMember b1 = new bronzeMember();
		
		b1.name="bronze";
		b1.customerID= 4444;
		b1.customerPoint= 500;
		
		b1.customInfo();
		b1.bronzeInfo();
		System.out.println("고객님의 포인트는 : "+ b1.bronzePoint +"점 입니다.");
		
		
		System.out.println();
		System.out.println("=========== goldMember : 업캐스팅 ==================");
		
		// goldMember 업캐스팅
		
			 Customer m2 = g1;
			 
			 m2.name = "upcastin-gold";													// customer	
			 m2.customerID= 2121;													// customer
	 		 m2.customerPoint = 2000;												// customer
	 		 
	 		 m2.customInfo();														// customer
	// 		 m2.goldInfo();															// gold	- 오류
	// 		 System.out.println("고객님의 포인트는 : "+ m2.goldPoint +"점 입니다.");	// gold	- 오류
	 		System.out.println(m2 instanceof goldMember );
	 		System.out.println(m2 instanceof Customer );
 		 
 		System.out.println("=========== goldMember : 다운캐스팅 ==================");	
 		// goldMember 다운캐스팅
	 		 
			goldMember gg1 = (goldMember) m2;
			
			 gg1.name = "upcasting-gold";											// customer	
			 gg1.customerID= 2121;													// customer
	 		 gg1.customerPoint = 2000;												// customer
	 		 
	 		 gg1.customInfo();														// customer
	 		 gg1.goldInfo();														// gold	
	 		 System.out.println("고객님의 포인트는 : "+ gg1.goldPoint +"점 입니다.");	// gold	
	 		System.out.println(gg1 instanceof Customer );
	 		 
	 		System.out.println("=========== SilverMember : 업캐스팅 ==================");
			
			// silverMember 업캐스팅
			
				 Customer m3 = s1;
				 
				 m3.name = "upcasting-silver";											// customer	
				 m3.customerID= 1111;													// customer
		 		 m3.customerPoint = 1000;												// customer
		 		 
		 		 m3.customInfo();														// customer
//		 		 m3.silverInfo();														// silver	- 오류
//		 		 System.out.println("고객님의 포인트는 : "+ m3.silverPoint +"점 입니다.");	// silver	- 오류
		 		System.out.println(s1 instanceof silverMember );
		 		System.out.println(s1 instanceof Customer );
	 		 
		 		System.out.println("=========== SilverMember : 다운캐스팅 ==================");
	 		// silverMember 다운캐스팅
		 		 
		 		silverMember ss1 = (silverMember) m3;
				
				 ss1.name = "upcasting-silver";												// customer	
				 ss1.customerID= 2222;													// customer
		 		 ss1.customerPoint = 1000;												// customer
		 		 
		 		 ss1.customInfo();														// customer
		 		 ss1.silverInfo();														// silver
		 		 System.out.println("고객님의 포인트는 : "+ ss1.silverPoint +"점 입니다.");	// silver
		 		System.out.println(ss1 instanceof silverMember );
//		 		System.out.println(ss1 instanceof m3 );
		 		System.out.println(ss1 instanceof Customer );
		 		 
		 		System.out.println("=========== bronzeMember : 업캐스팅 ==================");
				
				// bronzeMember 업캐스팅
				
					 Customer m4 = b1;
					 
					 m4.name = "upcasting-bronze";											// customer	
					 m4.customerID= 3333;													// customer
			 		 m4.customerPoint = 500;												// customer
			 		 
			 		 m4.customInfo();														// customer
//			 		 m4.bronzeInfo();														// bronze	- 오류
//			 		 System.out.println("고객님의 포인트는 : "+ m4.bronzePoint +"점 입니다.");	// bronze	- 오류
		 		 
			 	System.out.println("=========== bronzeMember : 다운캐스팅 ==================");
		 		// silverMember 다운캐스팅
			 		 
			 		bronzeMember bb1 = (bronzeMember) m4;
					
					 bb1.name = "upcasting-silver";												// customer	
					 bb1.customerID= 1212;													// customer
			 		 bb1.customerPoint = 1000;												// customer
			 		 
			 		 bb1.customInfo();														// customer
			 		 bb1.bronzeInfo();														// bronze
			 		 System.out.println("고객님의 포인트는 : "+ bb1.bronzePoint +"점 입니다.");	// bronze
		 		 
		
		
	}

}
