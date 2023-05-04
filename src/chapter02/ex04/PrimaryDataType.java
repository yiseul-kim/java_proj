package chapter02.ex04;

public class PrimaryDataType {

	public static void main(String[] args) {
	/*
	 자료형 :
	 	- 기본 자료형 : RAM - STACK(스텍) 공간에 변수명, 변수의 값이 저장
	 			- 8가지 기본 자료형 : boolean, 정수(byte, short, int, long), 실수(float, double), 문자(char)
 	 			- 정수형 자료형의 기본은 : int	<== long 선언후 변수의 값(리터럴)을 담을때 , l , L 을 정리해서 넣어줌
 	 			- 실수형 자료형의 기본은 : double	<== float 선언된 변수에 값을 넣을때, f, F 을 정리해서 넣어줌   
 	 	- 참조 자료형 : RAM - STACK(스텍) 공간에 Heap (힙)에 저장된 참조 주소를 가지고 있음 
 	 				& Heap(힙)에 값이 저장이 됨 
	 			- 무한대로 만들수 있음 (객체 (String) / 배열 / ... )
	 			
	 	* 리터럴 :  변수에 할당된 값을 통칭해서 리터럴
	 */
		
	//1. boolean :  true or false 값만 저장할 수 있는 자료
		boolean bool1 = true;   //,선언과 동시에 값넣을떄
 		
		boolean bool2 ;        
		bool2 = false;         // 선언 이후 나중에 값 넣을떄
		
		System.out.println(bool2);	//false
		// boolean bool3 = 1234; //오류 발생 = true나 false값이 아니라서
		// 변수의 값 수정 
		bool2 = true;
		
		
		System.out.println(bool1);	//true
		System.out.println(bool2);	//true
		
		// 상수 : 변수 이름 앞에 final 키가 붙은것, 
		// - 상수명은 변수와 구분하기 위해 대문자 사용
		
		//final boolean bool4 = false;	//false
		final boolean BOOL4 = false;
		
		//System.out.println(bool4);
		System.out.println(BOOL4);
		
		// 상수의 값은 수정할 수 없다.
		//bool4 = true ; // 오류발생
		
		System.out.println("-------------------------------");
		
	//2. 정수형 자료형 (Byte(1byte), short(2byte), int(4byte), long(8byte))
		
		// byte : 1byte( -2^7 ~ +2^7 ) 값을 저장할 수 있다. 1byte = 8bit
					// -128 ~ + 127
		
		byte val1 = -128;
		byte val2 = +127;
		
		System.out.println(val1);
		System.out.println(val2);
		
		// short : 2byte ( = 16bit ,  -2^15 ~ +2^15-1 )
							// -32,768 ~ 32,767
		short val3 = -32768;
		short val4 = +32767;
		
		System.out.println(val3);
		System.out.println(val4);
		
		// int : 4byte ( = 32bit ,  -2^31~+2^31-1)
							// -2,147,483,648 ~ 2,147,483,647
		
		int val5 = -2147483648 ;
		int val6 = 2147483647 ;
		
		System.out.println(val5);
		System.out.println(val6);
		
		// long : 8byte (= 64bit, -2^63 ~ +2^63-1 )
				// -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,808
				// long 형으로 선언된 변수에 값을 할당 할때 주의, 리터럴에 값을 넣으면서 
				//  : L, l (대문자L, 소문자l)을 붙여줘야함
		
		long val7 = -9223372036854775808L;
		long val8 = 9223372036854775807l;  // 1이랑 구분 어려워서 되도록 대문자L로 넣어주기
		
		long val9 = 922337203;	// int 자료형 보다 큰값을 넣을때 L		
		
		System.out.println(val7);
		System.out.println(val8);
		
		System.out.println("-------------------------------");

	//3. 실수형(소숫점) 자료형 : double이 기본이여서, float 자료형에 값을 할당 할 때, f, F
	//		-- float : 4byte, 소숫점 7자리까지 정밀도를 유지
	//		-- double : 8byte, 소숫점 15자리까지 정밀도를 유지
		
		float val10 = 1.123456789F; // 소숫점 이하 9자리까지 넣었지만 F( 7자리까지만 유지)
		System.out.println(val10);
		
		double val11 = 1.12345678910111213;
		System.out.println(val11);	// 1.12345678910111212
		
		System.out.println("-------------------------------");
		
	//4. 문자(char) : 1글자 ,  문자열 : 1글자 이상, Strign (참조 자료형, 객체), 리터럴에 값을 넣을때 ""
			// -- 리터럴에 값을 넣을때 : ''
			// -- 리터럴에 문자 : A,B,C,a,b,c
			// -- 리터럴에 특수 문자 : #, !, %
			// -- 아스키 코드 값으로 넣을 수 있음 : 숫자, 문자, 영문자, 특수문자 <== 7bit
			// -- 유니코드 값으로 넣을 수 있다. : '\u0041' , 2byte, 3byte <== 한글, 중국어, 일본어, ...
			// -- 한글 1자, 중국어 1자, 일본어 1자 .
		// 유니코드 
		// 직접 문자를 대입 : 영어( 대문자, 소문자), 숫자, 특수문자 <==7bit로 된 코드값을 가짐 :아스키 코드
		char val12 ='A';
		char val13 ='B';
		char val14 ='a';
		char val15 ='가';
		char val16 ='#';
		char val17 ='1';
		
		
		System.out.println(val12);		//A
		System.out.println((int)val12); //65
		
		System.out.println(val13);		//B
		System.out.println((int)val13); //66
		
		System.out.println(val14);		//a
		System.out.println((int)val14); //97
		
		System.out.println(val15);		//가
		System.out.println((int)val15); //유니코드 값 출력 : 44032
		
		System.out.println(val16);		//#
		System.out.println((int)val16); //유니코드 값 출력 : 67
		
		
		// 숫자 (아스키 코드값으로) char 변수에 값 할당.
		char val18 = 65;
		
		System.out.println(val18);
		
		// 유니 코드 값 으로 char 변수에 값을 저장
		char val19 = '\u0041';
		char val20 = '\uac00';
		char val21 = '\u0033';
		char val22 = '\ubc15';
		
		System.out.println(val19);
		System.out.println(val20);
		System.out.println(val21);
		System.out.println(val22);
		
		// 자신의 이름을(유니코드로) char 변수에 할당해서 작성하기 
		// 나의 이름은 000 입니다.  <== 출력
		
		char name1 = '\uae40';
		char name2 = '\uc774';
		char name3 = '\uc2ac';
		
		//1. println() : 문자열과 변수를 출력시  + 연결을 사용
		System.out.println("나의 이름은 "+name1+name2+name3+"입니다.");
		
		//2. print() : 문자열과 변수를 출력시 + 연결을 사용, \n으로 엔터 대행
		System.out.print("나의 이름은 "+name1+name2+name3+"입니다.\n" );
		
		//3. ptintg() : 문자열 내에서 ","뒤의 변수 값을 불러들임, %c : 변수값을 불러들임"
		System.out.printf("나의 이름은 %c%c%c입니다. ", name1, name2, name3 );
		
		System.out.println("-------------------------------");
		
		// 참조 자료형 : String (객체) : 문자열을 저장하는 자료형 : ""
			String val25 = "오늘의 날씨는 흐립니다.";
			System.out.println(val25);
	}

}
