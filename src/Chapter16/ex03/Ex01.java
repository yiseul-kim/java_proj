package Chapter16.ex03;

class Tiger {
	String name = "호랑이";
}
class Lion {
	String name = "사자"; 
}
class Eagle {
	String name = "독수리";
}

class Animal <T>{
	private T t;
	
	// getter
	public T getT() {
		return t;
	}
	
	//setter
	public void setT(T t) {
		this.t = t;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// Animal Generic 클래스에 Tiger, Lion, Eagle 클래스를 Setter주입하고, Getter로 가져와서 필드의 내용을 출력 
		
		// 호랑이 객체 생성
		Animal <Tiger> tiger = new Animal <Tiger> ();		
		// setter
		tiger.setT (new Tiger());		
		//getter
		System.out.println((tiger.getT()).name);
		
		// 사자 객체 생성
		Animal <Lion> lion = new Animal <Lion> ();
		//setter
		lion.setT(new Lion());
		//getter
		System.out.println((lion.getT()).name);
		
		// 독수리 객체 생성
		Animal <Eagle> eagle = new Animal <Eagle> ();
		//setter
		eagle.setT(new Eagle());
		//getter
		System.out.println((eagle.getT()).name);

	}

}
