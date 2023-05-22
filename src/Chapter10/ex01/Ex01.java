package Chapter10.ex01;

// 부모 클래스 ( Animal ) : 동물
class Animal {
	String name ; 
	int age ;
	String color;
	
	void eat () {
		System.out.println("Animal - 모든 동물은 먹습니다. ");
	}
	void sleep () {
		System.out.println("Animal - 모든 동물은 잠을 잡니다. ");
	}
}

// 자식 클래스 ( Tiger, Eagle, Lion, ===> Animal )	// 추가적으로 필드1(Sound), 메소드1(00Run) 정의
class Tiger extends Animal {
	String tigerSound;
	void tigerRun() {
		System.out.println("호랑이 걸음걸이 : 저벅저벅");
	}
}
class Eagle extends Animal {
	String eagleSound;
	void eagleRun() {
		System.out.println("독수리 걸음걸이 : 훨훨");
	}
}
class Lion extends Animal {
	String lionSound;
	void lionRun() {
		System.out.println("사장 걸음걸이 : 성큼성큼");
	}
}

// 자식의 자식 클래스 ( LionChild ===> lion )
class LionChild extends Lion {
	String lionchildSound;
	void lionchildRun() {
		System.out.println("사자의 새끼 걸음걸이 : 깡총깡총");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 자식 클래스( Tiger, Eagle, Lion, ===> Animal )
		Tiger t1 = new Tiger();
		
		//필드
		t1.name="호순이";
		t1.age=5;
		t1.color="노란색";
		t1.tigerSound="어흥";
		//메소드
		t1.eat();
		t1.sleep();
		t1.tigerRun();
		
		Eagle e1 = new Eagle();
		
		e1.name="독돌이";
		e1.age=3;
		e1.color="검은색";
		e1.eagleSound="까악까악";
		//메소드 
		e1.eat();
		e1.sleep();
		e1.eagleRun();
		
		Lion l1 = new Lion();
		
		l1.name="사돌이";
		l1.age=7;
		l1.color="흰색";
		l1.lionSound="멍멍";
		//메소드 
		l1.eat();
		l1.sleep();
		l1.lionRun();
		
		LionChild lc1 = new LionChild();
		
		lc1.name="사사";
		lc1.age=1;
		lc1.color="흰색";
		lc1.lionSound="으허허허헝";
		lc1.lionSound="와왕";
		//메소드 
		lc1.eat();
		lc1.sleep();
		lc1.lionRun();
		lc1.lionchildRun();
		

	}

}
