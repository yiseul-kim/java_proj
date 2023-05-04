package chapter02.ex05;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 타입 캐스팅 (Type Casting) : 정수 ==> 실수, 실수 ==> 정수
		 	
		 	// 낮은 자료형 =======> 높은 자료형
		 	 * byte => short => int => long => float => double
		 	 
		 	-- 업캐스팅	: 자동으로 변환, 낮은 자료형 ==> 높은 자료형으로 변환
		 	-- 다운캐스팅	: 자동으로 변환되지 않음, 수동으로 명시가 필요
		 				: 높은 자료형(실수) ==> 낮은 자료형(정수)으로 변환
		 	
		 */ 
		
			System.out.println("==================");
		
	//1. 캐스팅 방법 1
		// int val1 = 4.3; //오류 발생  ?val1:int로 선언했기 때문에 실수가 오면 오류
		int val2 = (int)4.3; // 다운 캐스팅 : 실수 4.3을 정수형으로 다운 캐스팅해서 변수에 할당, val2 : 4
							// 꼭! 수동으로 명시를 해야 한다. 
		System.out.println(val2);
		
		double val3 = 3;  // 업캐스팅 : 자동으로 이루어짐 정수 -> 실수 
		double val33 = (double)3; // 수동일 경우 만들어져야 하는 명령어
		
		System.out.println(val3);
		System.out.println(val33);
		
			System.out.println("==================");
		
		// 다운 캐스팅이 필요함. (명시해야함)
		 
		// int val4 = 5.8;
		// long val15 = 10.000344;
		
		int val4 = (int) 5.8;
		long val5 = (long) 10.000344;
		
		System.out.println(val4); // 한 라인 복사 : ctrl + art + <아랫쪽 화살표>
		System.out.println(val5);
		
		
		// 업캐스팅 (자동으로 업캐스팅 됨) 명시 하지 않아도 됨
		
		float val6 = (float) 5;
		double val7 = 6;
		
		System.out.println(val6);
		System.out.println(val7);
			
			System.out.println("==================");
		
		
		
		
		
		
		
		
	}

}
