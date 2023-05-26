package Chapter16.ex04;

class KeyValue < K , V  > {
	/*		A ~ Z 중 임의의 타입을 지정
	 		T : Type 
	 		K : Key
	 		V : Value
	 		N : Number	 		
	 */
	
	private K key ;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}	
}

public class TwoGenericAguments {
	public static void main(String[] args) {
		// 1. String , Integer 를 아규먼트로 하는 객체 생성 
		KeyValue <String, Integer> kv1 = new KeyValue <> ( ) ;

		// setter 주입
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		// getter를 사용해서 필드의 값 출력
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("=======");
		
		KeyValue <String, Integer> kv2 = new KeyValue <> ( ) ;
		
		kv2.setKey("오렌지");
		kv2.setValue(2000);
	
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		// 2. Integer, String를 아규먼트로 객체 생성
		KeyValue <Integer, String> kv3 = new KeyValue ( ) ;		// <>이거 생략 가능
		
		System.out.println("=======");

		// setter 주입
		kv3.setKey(404);
		kv3.setValue("해당 요청은 페이지를 찾을 수 없습니다. ");
		
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());

		System.out.println("=======");

		// 3. 아규먼트에 void를 사용하면 해당 아규먼트는 사용하지 않도록 설정할 수 있다. 
		// 주의! void의 v는 대문자 'V' 여야 함.(객체형으로 사용하기 위해) 
		KeyValue <String, Void> kv4 = new KeyValue () ;
		
		kv4.setKey("키값만 사용");
		System.out.println(kv4.getKey());

		kv4.setValue(null);			// Void 로 지정 => only "null"만 입력 가능 null은 비어있는 값. 	
		System.out.println(kv4.getValue());
		
		System.out.println("=======");
		
	
		
		
		
		
		
		
		
	}
}
