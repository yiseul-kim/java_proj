package Chapter07.ex02_method;

class MethodOverloading {
	
	//인풋 매개변수가 없는 메소드
	void print () {
		System.out.println("데이터가 존재하지 않습니다. ");
	}
	
	// 인풋 매개변수에 정수 1개를 인풋 받는 메소드
	void print (int a ) {
		System.out.println("int : "+ a);
	}
	
	// 인풋 매개변수에 실수 1개를 인풋 받는 메소드 
	void print (double a) {
		System.out.println("double : " + a );
	}
	
	// 인풋 매개변수에 정수 2개를 인풋 받는 메소드
	void print (int a, int b) {
		System.out.println("int a : "+ a + " , int b : "+ b);
	}
	
	// 인풋 매개변수에 실수 2개를 인풋 받는 메소드 
	void print (double a, double b) {
		System.out.println("double a : " + a + " , double b : " + b );
	}
	
	// 오류 발생!! : 인풋 매개변수의 갯수, 자료형이 동일할 때 동시작동 -> 오류
//	void print (int k ,int g ) {
//		System.out.println("int k : "+ k + " , int g : "+ g);
//	}
	
	//메소드 오버 라이딩 : 부모 클래스의 메소드를 재정의 해서 사용함. 
			// 상속에서 적용, 
	@Override
	public String toString() {
		
		return "객체 자체를 출력시 object 클래스의 toString() 를 출력"; 	
	}
}

public class Method05 {
	public static void main(String[] args) {
		/*
		 메소드 오버로딩	: 동일 한 이름의 메소드이지만 시그니쳐에 따라서 다른 메소드를 식별
		 				- 시그니쳐 : 메소드를 식별하는 식별자 , 인풋 아규먼트 갯수, 인풋 아규먼트의 자료형에 따라서 
		 							다른 메소드인것을 식별
		 메소드 오버라이딩	: 상속에서 작동됨. 부모 클래스의 메소드를 자식 클래스에서 재정의 
		 	자바의 모든 클래스는 object 클래스를 상속 받는다. 
		 	Object 클래스의 필드나, 메소드를 사용할 수 있다. 
		 	
		 
		 */
		
		// 												<메소드 오버로딩>
		MethodOverloading m1 = new MethodOverloading();
		
		// 매개 변수가 없는 print()	메소드 호출 
		m1.print();
		// 매개 변수 정수 1개 
		m1.print(2);
		// 매개 변수 실수 1개
		m1.print(3.54);
		// 매개 변수 정수 2개
		m1.print(5,6);
		// 매개 변수 실수 2개
		m1.print(5.45, 6.85);
		
		
		
		// 											  <메소드 오버라이딩>
		// Object 클래스의 메소드 출력 
				System.out.println(m1);				//객체 자체를 출력 
				System.out.println(m1.toString());	//Object 클래스의 메소드   //모든 클래스의 부모 클래스는 object 
				// object 클래스를 재정의 하지 않을 경우의 값 - Chapter07.ex02_method.MethodOverloading@76ccd017
				// 위 @Override 와 같이 재정의 했을때의 값 - 객체 자체를 출력시 object 클래스의 toString() 를 출력
				// 오버라이딩을 재정의 해서 원하는 부모의 값을 출력할 수 있게 한다. 
		
	}
}
