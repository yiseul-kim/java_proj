package chapter02.ex01;

public class NamingVriable {
	public static void main(String[] args) {

		// 변수 이름 지정 규칙 (변수명)
		 // 소문자로 시작
		 // 한글을 변수 명으로 사용할 수 있다. (권장사항은 아님)
		 //  특수문자는 2개만 사용 가능 
		 // 변수명에 숫자를 사용할 수 있으나, 첫 자에 숫자가 오면 오류가 발생
		 // 자바에서 사용하는 예약어는 변수명으로 사용할 수 없다. ( package, public, class, int .....) 

		boolean aBcD;  //가능
		byte 가나다라;  // 가능
		// byte 3bb;          //오류발생 변수명에 첫자에는 숫자가 오면 오류 발생
		boolean _abcd;  // 가능(_)
		int $cde;            // 가능($)
		int ABCDE;       //  가능(but 대문자는 권장사항 아님) , 변수 : 소문자로 시작, 상수 : 대문자
		int myWork;       // 변수명은 처음단어는 소문자, 두번째 단어는 첫 자가 대문자 형태로 많이 씀

	}

}
