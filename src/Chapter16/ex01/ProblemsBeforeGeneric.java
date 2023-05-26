package Chapter16.ex01;

// 상품을 저장하는 클래스 : Object 와 Generic을 사용하지 않는 경우 , 하나의 상품 클래스에 하나의 타입의 상품을 저장할 수 있다. 

class Apple {}				//Apple 클래스 
class Goods1 {		// 상품을 저장하는 클래스 <== 한 종류의 상품을 저장함. (Apple 객체만 저장)
		private Apple apple = new Apple ();
		
		//getter
		public Apple getApple ( ) {
			return apple ;
		}
		
		//setter
		public void setApple(Apple apple) {
			this.apple = apple ;
		}
		
	
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		/*
		 	제너릭을 사용하기전의 여러 가지 문제점 : 
		 		- 제너릭은 클래스 내부에 다양한 타입을 사용자가 정의 해서 넣을 수 있다. 
		 		- 제너릭 사용 전 : 하나의 클래스에 다양한 타입의 정보를 저장하려면 각각의 클래스를 만들어서 사용(불편쓰)
		 		- 하나의 클래스에 다양한 객체 정보를 저장하기 위해서 Object 타입으로 업캐스팅해서 저장후, 
		 			다운캐스팅을 사용해 객체 정보를 읽/쓰기를 했음.
		 		- 제너릭을 사용하면 업캐스팅/ 다운캐스팅이 필요없이 여러 타입의 객체를 하나의 클래스에 넣고 뺄수 있다. 
		 		
		 */

	}

}
