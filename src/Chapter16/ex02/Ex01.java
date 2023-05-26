package Chapter16.ex02;

class Tiger {
	String name = "호랑이";
}
class Lion {
	String name = "사자"; 
}
class Eagle {
	String name = "독수리";
}

class Animal {
	
	private Object obj = new Object();
	
	// getter : 객체정보 출력
	public Object getObj () {
		return obj;
	}
	
	// setter : obj 필드의 값을 적용
	public void setObj (Object obj) {
		this.obj = obj;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 		Animal 클래스에 Tiger, Lion, Eagle 객체를 setter 주입하고 ==> Object 타입
		 		getter 를 사용해서 가져와서 name 필드를 출력 
		 		
		 */
		Animal a1 = new Animal();
		//Tiger
		Tiger t1 = new Tiger();
		a1.setObj(t1);		
		System.out.println(((Tiger)a1.getObj()).name);
		
		// Lion
		Lion l1 = new Lion();
		a1.setObj(l1);		
		System.out.println(((Lion)a1.getObj()).name);
		
		// Eagle
		Eagle e1 = new Eagle();
		a1.setObj(e1);
		System.out.println(((Eagle)a1.getObj()).name);
		

	}

}
