package Chapter12.ex01;

abstract class Animal {		// 추상 클래스
	//구현부가 없이 선언만 된 메소드 : 추상 메소드 <== 자식 클래스에서 오버라이딩해서 구현부를 만들어 줘야 한다. 
	abstract void eat();
	abstract void run();
	abstract void cry();
}
class Tiger extends Animal {	// 콘크리트 클래스 : 추상메소드를 모두 구현한 클래스

	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다. ");		
	}
	@Override
	void run() {
		System.out.println("호랑이는 껑충껑충 달립니다. ");		
	}
	@Override
	void cry() {
		System.out.println("호랑이는 어흥하고 웁니다. ");		
	}	
}
abstract class Lion extends Animal {	// 추상 클래스 : 부모의 추상메소드를 일부만 구현한 경우 

	@Override
	void eat() {
		System.out.println("사자는 고기를 먹습니다. ");		
	}
	@Override
	void run() {
		System.out.println("사자는 펄쩍펄쩍 달립니다. ");		
	}
}
class LionChild extends Lion {		// 콘크리트 클래스 : 부모의 추상메소드를 모두 구현한 클래스 

	@Override
	void cry() {
		System.out.println("아기사자는 응애하고 웁니다. ");		
	}	
}

public class Abstract_Method02 {

	public static void main(String[] args) {
		// 1. 추상 클래스는 객체화 할 수 없다. 
//		Animal a1 = new Animal();
		
		// 2. 자식 클래스를 객체화 해서 타입으로 지정은 가능(콘크리트 클래스만 가능)
		Animal a2 = new Tiger();
//		Animal a3 = new Lion();		// Lion은 추상 클래스이기 때문에 지정 불가
		Animal a4 = new LionChild(); 
		
		// 3. 오버라이딩된 메소드 호출
		 a2.run();
		 a2.eat();
		 a2.cry();
		 a4.run();
		 a4.eat();
		 a4.cry();
		 
		 // 4. for문으로 메소드 호출
		 Animal [] arr = new Animal [] { a2, a4 } ;
		 for (int i = 0 ; i<arr.length ; i++) {
			 		 
		 }
		 
		

	}

}
