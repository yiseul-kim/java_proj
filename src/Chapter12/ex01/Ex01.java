package Chapter12.ex01;

abstract class Car { 	//추상 클래스 : 트럭(경유) , 자가용(휘발유), 굴삭기(경유), 봉고(LPG) ...
	
	abstract void run ();
	abstract void eat ();
	
}
class Truck extends Car {
	@Override
	void run() {
		System.out.println("트럭은 부릉부릉 달립니다. ");
	}
	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다. ");		
	}	
}
class PrivateCar extends Car {
	@Override
	void run() {
		System.out.println("자가용은 씽씽 달립니다. ");
	}
	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 먹습니다. ");		
	}	
}
class Excavator extends Car {
	@Override
	void run() {
		System.out.println("굴삭기는 덜컹덜컹 달립니다. ");
	}
	@Override
	void eat() {
		System.out.println("굴삭기는 경유를 먹습니다. ");		
	}	
}
class Van extends Car {
	@Override
	void run() {
		System.out.println("봉고는 덩기덕덩기덕 달립니다. ");
	}
	@Override
	void eat() {
		System.out.println("봉고는 LPG를 먹습니다. ");		
	}	
}

public class Ex01 {

	public static void main(String[] args) {
		// 구현한 클래스를 생성후, 자식 객체를 생성시 부모 타입으로 지정후 오버라이딩된 메소드 호출
		// 12:20 
		
		Car c1 = new Truck();
		Car c2 = new PrivateCar();
		Car c3 = new Excavator();
		Car c4 = new Van();
		
		Car arr[] = new Car [] { c1, c2, c3, c4 };
		
		for ( Car k : arr) {
			k.run();
			k.eat();
		}
		
	}

}
