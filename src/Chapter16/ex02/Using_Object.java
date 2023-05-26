package Chapter16.ex02;

class Banana {
	Banana () {}
	Banana (String name) {
		this.name = name;
	}
	String name ;
}

class Orange {
	Orange  () {}
	Orange  (String name) {
		this.name = name;
	}
	String name ;
}

class Pencil {
	Pencil () {}
	Pencil (String name) {
		this.name = name;
	}
	String name ;
}


class Goods2 {
	
	// 필드 
	private Object obj = new Object ();

	// getter : 필드의 값을 리턴 
	public Object getObj () {
		return obj;
	}
	
	// setter : 필드의 값을 할당
	public void setObj (Object obj) {		// obj 변수에 자바의 모든 클래스(여러 타입)를 담을 수 있다. 
		this.obj = obj;
	}
}

public class Using_Object {

	public static void main(String[] args) {
		/*
		 	Object 는 모든 클래스의 부모 이다. 
		 		- 모든 객체는 Object 타입으로 저장이 가능
		 		- 다운 캐스팅해서 필드/메소드의 내용을 출력 할 수 있다. 
		 		- 문제가 발생됨 : Object 업캐스팅 되어서 들어간 하위 타입을 알아내기가 어렵다. 
		 		
		 */
		
		// 1. Good2 객체 생성
		Goods2 g2 = new Goods2 ();
		
		// Goods2 (상품) : 바나나  
			Banana b1 = new Banana("바나나");		
			g2.setObj(b1);									// 방법 1	b1 : Banana ==> Object 으로 자동 업캐스팅됨. 		
			g2.setObj(new Banana("바나나"));		// 방법 2
			
			Object o1 = g2.getObj();					// getter 를 사용해서 객체를 가지고 온다. 
			Banana bb1 = (Banana) o1 ;				// 다운 캐스팅		
			System.out.println(bb1.name); 			// 출력
			
		// Goods2 (상품) : 오렌지
			g2.setObj(new Orange("오렌지")); 		// Orange ==> Object로 업캐스팅 되어 들어감. 		
			System.out.println( ( (Orange)g2.getObj () ) . name );		// 다운캐스팅 + 출력
			

		// Goods2 (상품) : 연필

			g2.setObj(new Pencil("연필")); 		// Pencil ==> Object 타입으
			System.out.println(((Pencil)g2.getObj()).name);
			
			
			
			
			
			
			
	}

}
