package Chapter10.ex02;

class Animal {		// 부모 클래스 
	String name;
	int age;
	void eat() {
		System.out.println("모든 동물은 먹습니다.  ");
	}
}

// 자식 클래스 ( Tiger, Lion )
class Tiger extends Animal {
	
	String tigerCry ;
	void tigerRun() {
		System.out.println("호랑이는 달립니다. ");
	}
}

class Lion extends Animal {
	String LionCry ;
	void lionRun() {
		System.out.println("사자는 달립니다. ");
	}
}

// 자식의 자식 클래스 ( LionChild )
class LionChild extends Lion {
	String LionChildCry ;
	void lionChildRun() {
		System.out.println("아기사자는 엉금엉금 기어갑니다. ");
	}
}


public class TypeCasting01 {
	public static void main(String[] args) {
		/*
		 	객체의 타입 변환 ( Object Type Casting ) :
		 		- 업캐스팅 (upcasting) : 자식 객체 => 부모 타입으로 변환, 명시하지 않아도 자동 변환됨.
		 				-- 객체를 배열 / 컬렉션에 저장하기 위해 동일한 타입으로 배열이나 컬렉션에 저장.
		 				
		 		- 다운캐스팅 (downcasting) : 부모 타입 => 자식 타입으로 변환, 명시해서 변환
		 				-- instanceof를 사용해서 자식 타입이 존재하는지 살펴보고 다운 캐스팅을 해야함.
		 				-- 만약 자식 타입이 존재하지 않을 경우 실행시 오류 발생.
		 */
		
		// 1. Animal 
			Animal a1 = new Animal ();		//a1은 Animal 타입만 존재함. 
		
			// a1은 Animal 타입만 존재 : Animal 클래스의 필드나 메소드만 접근
				// a1 : Tiger, Lion, Child type을 소유하고 있지 않음. 
			a1.age = 10 ;
			a1.name = "동물";
			a1.eat();
		
		// 2. Tiger
			Tiger t1 = new Tiger();		// t1은 Tiger, Animal 타입을 가진다. 
		
			// t1 : Tiger / Anymal
				t1.tigerCry = "어흥";		// Tiger 필드
				t1.tigerRun(); 				// Tiger 메소드
				
				t1.name="호랑이";			// Animal 필드
				t1.age= 20;					// Animal 필드
				t1.eat(); 					// Animal 메소드
		
			//업캐스팅( upcasting ) : 자식 타입을 부모 타입으로 변환 :  t1 ( Animal(부모), Tiger(자식) )
				Animal a2 = t1;			// (Animal) t1; 생략됨. 
									// Tiger => Animal 업캐스팅 됨
			
			// a2는 Animal 타입으로 업캐스팅 : Animal 타입에 있는 필드&메소드만 접근가능(tiger 사용 못함 ㅠ)
				System.out.println("=====================");
				System.out.println(a2.name);
				System.out.println(a2.age);
	//			System.out.println(a2.tigerCry);	// Tiger에 있는건 접근 불가(!오류)
		
			// a2는 Animal 타입으로 정의 : Tiger / Animal 타입을 내포 so 다운캐스팅 가능
		
			// 다운캐스팅 : 부모 => 자식 변환, 명시해서 변환, 반드시 instanceof를 사용해야 함.
				Tiger tt1 = (Tiger) a2; 	//(Tiger) 부분 꼭 명시해줘야함
			
			// tt1은 Tiger 타입으로 다운 캐스팅 : Tiger / Animal <== 부모/자식 필드&메소드 모두 사용가능
				System.out.println("=====================");
				System.out.println(tt1.name);		// Animal
				System.out.println(tt1.age);		// Animal
				System.out.println(tt1.tigerCry);	// Tiger
		
			//3. Lion 객체를 생성 : l1 : Lion / Animal
			// 자식 클래스를 객체화 시키면 부모 클래스의 필드/메소드 사용 가능
				Lion l1 = new Lion();
				
			// Lion 필드/메소드 , Animal 필드/메소드 둘다 사용 가능
				System.out.println("=====================");
				l1.lionRun();		//Lion
				l1.eat();			//Animal
		
			// 업캐스팅 : Lion (l1) => Animal (aa2)
				Animal aa2 = l1;
			// Animal의 필드/메소드만 접근 됨. 

			//다운 캐스팅 :	Animal (부모) => Lion (자식) 
			// Lion/Animal 모두 사용가능
				Lion ll2 = (Lion) aa2; 
			
		System.out.println("======instanceof ll2========");
			
			// 객체 내부에 해당 타입이 존재하면 true , 존재하지 않으면 false
				System.out.println(ll2 instanceof Animal );	//true
				System.out.println(ll2 instanceof Lion ); 	//true
				
				System.out.println(a1 instanceof Tiger ); 	//false
				System.out.println(a1 instanceof Animal ); 	//true
			
			
			// a1 : Animal 
			// 객체 내부에 해당 타입이 존재하지 않는 경우 : 실행시 오류 발생
			// 컴파일 단게에서는 오류가 발생되지 않음.
				if( a1 instanceof Tiger ) { 	// false : a1 객체는 Tiger타입이 존재하지 않음/4
					Tiger ttt1 = (Tiger) a1;					
				}else {
					System.out.println("해당 객체는 Tiger 타입이 존재하지 않습니다. ");
				}
		
//			Tiger tt22 = (Tiger) a1;
			
			
			
		// 4. LionChild : LionChild / Lion / Animal 모두 포함 
			LionChild lc1 = new LionChild();
			
			lc1.age = 30;				// Animal
			lc1.LionCry = "어흥";		// Lion
			lc1.LionChildCry = "응애";	// LionChild
	
					
				
			// LionChild => Animal 업캐스팅
				Animal a5 = lc1; 
					//a5는 Animal 의 필드/메소드만 접근 : LionChild / Lion / Animal
				
				System.out.println("======instanceof a5 ========");
				System.out.println(a5 instanceof Animal );
				System.out.println(a5 instanceof Lion );
				System.out.println(a5 instanceof LionChild );
				
			// 다운 캐스팅
				
				Lion ll7 = null;		// 밖에서 선언+객체의 초기화 null
				if (a5 instanceof Lion ) {
					ll7 = (Lion) a5;
					System.out.print("a5는 Lion 타입으로 잘 캐스팅 되었습니다. :");
					System.out.println(a5 instanceof Lion);
				}else {
					System.out.println("a5는 Lion 타입으로 다운 캐스팅 할 수 없습니다. ");
				}
			
			//ll7 : Lion / Animal 접근 ok, LionChild/ Lion / Animal 내포
				ll7.LionCry="어흥 어흥 어흥";		//Lion
				ll7.eat();
			
				System.out.println("===============================");
			// LionChild 로 다운캐스팅 
				LionChild lc9 = (LionChild) ll7;
				
		
		
		
		
		
	}
}
