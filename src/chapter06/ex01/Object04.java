package chapter06.ex01;

class car{
	
	//기본생성자
	public car() {}
	
	//필드 (속성)
	
	String company ;		//제조사
	String carName ;		//차명
	String carColor ;		//차색
	int carSpeed;			//차 속도
	double carWeight;		//차 무게
	
	//메소드 (기능)
	public void stop () {
		System.out.println(carName +  "가(이) 멈춥니다. ");
	}
	public void start() {
		System.out.println(carName + "가(이) 달립니다. ");
	}
	public void print() {
		System.out.println("회사명 : "+ company );
		System.out.println("차이름 : "+ carName );
		System.out.println("차색깔 : "+ carColor );
		System.out.println("차속도 : "+ carSpeed );
		System.out.println("차무게 : "+ carWeight +"톤" );
	}
}

public class Object04 {
	
	public static void main(String[] args) {
			// c1 객체 : 현대자동차 / 그랜저 / 검은색 / 250 / 1.0
			// c2 객체 : 쌍용자동차 / 투싼 / 노랑색 / 300 / 2.0
			// c2 객체 : 기아자동차 / k9 / 흰색 / 350 / 2.5
		
			System.out.println("=========================");
			// 각 개체의 메소드 출력
			// c1 객체 : 현대자동차 / 그랜저 / 검은색 / 250 / 1.0
			
			car a = new car();
			
			//객체 자체를 출력 할 경우 : 객체의 heap주소가 출력됨 : 패키지이름.클래스이름@주소 : 16진수
			System.out.println(a);
			
			System.out.println("=========================");
			//객체의 필드의 값
			a.company = "현대자동차";
			a.carName = "그랜저";
			a.carColor = "검은색";
			a.carSpeed = 250;
			a.carWeight = 1.0;
			//객체의 메소드 호출
			a.print();
			a.start();
			a.stop();
			
			System.out.println("=========================");
			//객체의 필드의 값
			car b = new car();
			b.company = "쌍용자동차";
			b.carName = "투싼";
			b.carColor = "노랑색";
			b.carSpeed = 300;
			b.carWeight = 2.0;
			//객체의 메소드 호출
			b.print();
			b.start();
			b.stop();
			
			System.out.println("=========================");
			//객체의 필드의 값
			car c = new car();
			c.company = "기아자동차";
			c.carName = "k9";
			c.carColor = "흰색";
			c.carSpeed = 350;
			c.carWeight = 2.5;
			//객체의 메소드 호출
			c.print();
			c.start();
			c.stop();
			System.out.println("=========================");
			
			System.out.println("===== 객체를 배열에 저장 ===========");
			// c1, c2, c3 객체를 1차원 배열에 저장
			
			car[] arr1 = new car[3];	//arr1은 Car이라는 자료형을 넣을수 있음. 
			
			arr1[0] = a ; 
			arr1[1] = b ;
			arr1[2] = c ;
			
			
			
			
			
			
			
			
	
	}
}
