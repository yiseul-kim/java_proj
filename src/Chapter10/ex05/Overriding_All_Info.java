package Chapter10.ex05;

class C {	// 부모
	
	// 필드 : 오버라이딩X (자식과 완전히 별개)
	int m = 3;
	static int n = 30;

	//인스턴스 필드 : 오버라이딩O
	void print() {
		System.out.println("C");
	}
	//정적 필드 : 오버라이딩X (부모/자식 별개)
	static void print3() {
		System.out.println("C");
	}

}

class D extends C {		//자식
	//필드 
	int m = 4;
	static int n = 40;
	
	void print() {
		System.out.println("D");
	}
	//정적 필드 : 오버라이딩X (부모/자식 별개)
	static void print3() {
		System.out.println("D");
	}


}

public class Overriding_All_Info {

	public static void main(String[] args) {
		// 
		C c1 = new D();
		System.out.println(c1.m);
		System.out.println(c1.n);
		c1.print();
		c1.print3();
		
		//다운캐스팅
		D d1 = (D) c1;
		System.out.println(d1.m);	//4
		System.out.println(d1.n);	//40
		d1.print();					//D
		d1.print3();				//D
		

	}

}
