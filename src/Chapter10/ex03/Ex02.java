package Chapter10.ex03;

// 부모(Super) 클래스 : Animal
class Animal1 {
	
	// 인스턴스 메소드 : 오버라이딩은 인스턴스 메소드만 오버라이딩됨. << 인스턴스 메소드 오버라이딩>>
			// 필드는 오버라이딩 되지 않는다. < 인스턴스필드, 정적 필드 >
			// 정적 메소드도 오버라이딩 되지 않는다.
	void run () {
		System.out.println("Animal 클래스 : run - 모든 동물은 달립니다. ");
	}

	@Override
	public String toString() {
		return "Animal1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

class tiger1 extends Animal1 {
	@Override
	void run() {
		System.out.println("호랑이는 껑충 껑충 달립니다. ");
	} 
}
class egle1 extends Animal1 {
	@Override
	void run() {
		System.out.println("독수리는 훨훨 납니다. ");
	} 
}
class Cat1 extends Animal1 {
	@Override
	void run() {
		System.out.println("고양이는 사뿐사뿐 달립니다. ");
	} 
}
class CatChild1 extends Cat1 {
	@Override
	void run() {
		System.out.println("아기고양이는 엉금 엉금 달립니다. ");
	} 
}

public class Ex02 {

	public static void main(String[] args) {
		// 자식 클래스를 객체화 해서 부모타입으로 지정후 메소드 호출시 자식에서 오버라이딩된 메소드를 출력 ... 
		
		
		// 자식 클래스를 객체화 해서 부모 타입으로 지정
		// 부모의 메소드를 호출시 자식의 오버라이딩된 메소드가 출력. 
		Animal1 a1 = new tiger1() ;
		Animal1 a2 = new egle1();
		Animal1 a3 = new Cat1();
		Animal1 a4 = new CatChild1();
		
		//Animal의 run() 메소드 <== 자식 클래스의 run()가 작동됨
		a1.run();
		a2.run();
		a3.run();
		a4.run();
		
		//배열에 저장해서 한번에 출력
		System.out.println("======== 배열에 저장후 한번에 출력 =========");
		Animal1[] arr = new Animal1 [] { a1, a2, a3, a4 } ;  
		
		
		// for 문을 사용해서 각 배열의 메소드 호출	// arr.length : 4
		for (int i = 0 ; i < arr.length ; i++ ) {
			
			// Animal 타입의 run이 호출됨
			arr[i].run();
		}
		
		// Enhanced For 문을 사용해서 출력
		System.out.println("==== Enhanced For 문을 사용해서 출력 =====");
		
		for ( Animal1 k : arr ) {
			k.run();
		}
		
		
		
		
		
		
		
		
	}

}
