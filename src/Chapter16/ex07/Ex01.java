package Chapter16.ex07;

class Apple {
	
	String Name = "사과";	
}
class Banana {
	String Name = "바나나";
}
class Orange {
	String Nmae = "오렌지";
}

// 모든 객체를 받는 generic 
class Aa <T> 	{			//모든 타입을 받는 클래스
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class Bb <T extends Apple> { 		//T 타입으로 Apple, Banana만 적용가능
	private T t ;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}



public class Ex01 {
	public static void main(String[] args) {
		//Aa : 제너릭 타입에 모든 타입을 적용 가능
		Aa <String> a1 = new Aa <>	()	;
		Aa <Integer> a2 = new Aa <>	()	;
		Aa <Double> a3 = new Aa <>	()	;
		Aa <Banana> a4 = new Aa <>	()	;
		Aa <Apple> a5 = new Aa <>	()	;
		Aa <Orange> a6 = new Aa <>	()	;
		
		//Bb : 제너릭 타입에 Apple만 가능
//		Bb <Integer> b2 = new Bb <>();
//		Bb <Double> b3 = new Bb <>();
//		Bb <Orange> b6 = new Bb <>();
//		Bb <String> b1 = new Bb <>();
//		Bb <Banana> b5 = new Bb <>();

		Bb <Apple> b4 = new Bb <>();
		
	}
}
