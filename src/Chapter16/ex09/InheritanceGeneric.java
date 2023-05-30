package Chapter16.ex09;

// 부모 클래스 : 제너릭 클래스 
class Parent <T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}	
}
// 자식 클래스 : 제너릭 클래스 <== 부모 타입이 반드시 하나 이상 
class Child <T> extends Parent <T> {
	
}
class Child2 <T, V> extends Parent <T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}

public class InheritanceGeneric {

	public static void main(String[] args) {
		/*
		  제너릭 클래스의 상속 :
		  			- 자식 클래스는 부모 클래스와 타입의 개수가 같거나 많아야 한다. 
		 */
		
		// 1. 부모 제너릭 클래스
		Parent <String> p1 = new Parent <> ();
		p1.setT("부모 제너릭 클래스");
		System.out.println(p1.getT());
		
		Parent <Double> p2 = new Parent <> ();
		p2.setT(33.33);
		System.out.println(p2.getT());
		
		// 2. 자식 클래스 1
		Child <String> c1 = new Child();
		c1.setT("자식1 - 제너릭 클래스 ");	// 부모에서 상속 받은 메소드 
		System.out.println(c1.getT());			// 부모에서 상속 받은 메소드 
		
		// 2. 자식 클래스 2
		Child2 < String, Integer > c2 = new Child2 () ; 
		
		c2.setT("자식2 - 제너릭 클래스");		// 부모에서 상속되어서 내려오는 메소드 
		c2.setV(100);								// 자신에서 정의한 메소드 
		
		System.out.println(c2.getT());				// 부모 상속 
		System.out.println(c2.getV());				// 자식 생성 
		
		
		
		
		
	}

}
