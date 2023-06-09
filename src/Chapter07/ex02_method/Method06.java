package Chapter07.ex02_method;

class MethodOverriding {
	// 메소드 오버 라이딩 : 부모 클래스의 메소드를 재정의 해서 사용
	
	// 기본 생성자 : 객체를 생성할 때 필드의 초기값
			// 다른 생성자가 없을 때 생략시 호출 가능
			// 다른 생성자가 존재할 떄 생략시 호출 불가능
	MethodOverriding () {} 		//기본 생성자 
	
	// 사용자 정의 생성자 : 매개변수로 인풋 값을 아규먼트에(인풋값 받는 하나하나를 아규먼트라고 함) 받아서 필드에 로드 시켜줌
	MethodOverriding ( String a, String b, String c, int d, double e ) {
		company = a;
		model = b; 
		color = c;
		maxSpeed = d;
		weight = e;
	}
	
	String company ; 
	String model ; 
	String color ;
	int maxSpeed ;
	double weight ;
	
	// 객체 자체를 출력시 객체의 heap주소를 출력하는 것이 아니라, 객체의 RAM에 들어있는 값을 출력하도록 함. 
	// Object 클래스의 toString() 메소드를 오버라이딩 해서 출력 
	
	@Override
	public String toString() {
	
		return "회사명 : " + company + ", 모델명 : "+ model +" , 색깔 : "+ color +" , 최대속도 : "+ 
		maxSpeed + " , 차무게 : "+ weight;
	}
	
}

public class Method06 {

	public static void main(String[] args) {
		/*
		 Object 클래스 : 모든 자바 클래스의 최상의 부모 클래스
		 	- 모든 클래스는 Object 클래스의 필드와, 메소드를 상속 받습니다. 
		 	- 자식 클래스는 Object 클래스의 필드와, 메소드를 사용 할 수 있다. 
		 	- toString() 메소드는 객체 자체를 출력 할때, toString() 이 작동됨.
		 		- 자식 클래스에서 toString() 메소드를 재정의 해서 사용함. 
		 		- 그 객체의 필드의 값을 출력할 때 많이 사용됨.3 
		 */
		
		// 기본생성자 호출후 출력
		MethodOverriding m1 = new MethodOverriding();
		System.out.println(m1);
		System.out.println(m1.toString());
		
		// 사용자 정의 생성자 호출후 출력
		MethodOverriding m2 = new MethodOverriding("현대","그랜져","검은색",250,1000.0);
		MethodOverriding m3 = new MethodOverriding("기아","k9","흰색",350,2000.0);
		MethodOverriding m4 = new MethodOverriding("삼성","sm5","초록색",270,1500.0);
		MethodOverriding m5 = new MethodOverriding("쌍용","투싼","노란색",250,1700.0);
		
		System.out.println("==================");
		// 각 개체의 필드의 값을 출력
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
	}

}
