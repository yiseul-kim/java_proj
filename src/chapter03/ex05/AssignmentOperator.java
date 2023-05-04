package chapter03.ex05;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 대입 연산자 : +=, -=, *=, /=
		 	기존 연산의 축약된 표현(컴퓨터는 단순할수록 좋아함)
		 		val1+=10; <==> val1=val1+10;
		 */
		
		//1. 대입 연산자의 축약 표현
		int val1 = 3;
		val1=val1+3;	// val +=3
		System.out.println(val1);
		
		int val2 = 3;
		val2+=3;			// val2 = val2 + 3; 명령어를 단순하게 변환
		System.out.println(val2);	// 위아래 출력값은 동일
		System.out.println("============================");
		//
		int val3=10;
		val3=val3 -15;
		System.out.println(val3);	//-5
		
		int val4=10;
		val4-=15;	// val4=val4-15;
		System.out.println(val4);
		
		
		
		System.out.println("============================");
		
		
		
		
		
		
		
		
		
	}

}
