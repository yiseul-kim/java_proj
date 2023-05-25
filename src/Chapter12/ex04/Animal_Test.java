package Chapter12.ex04;

public class Animal_Test {

	public static void main(String[] args) {
		// 1. 각 클래스를 객체화 해서 Interface 타입으로 지정후 메소드 호출, Animal (인터페이스) / 
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Tiger();
		Animal a4 = new Lion();
		
		Animal arr[] = new Animal [] {a1, a2, a3, a4};
		
		for(Animal k : arr) {			
			k.cry();
			k.run();
			System.out.println("=========");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
