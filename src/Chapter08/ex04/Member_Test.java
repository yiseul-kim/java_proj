package Chapter08.ex04;

public class Member_Test {
	
	public static void main(String[] args) {
		
		// Member 객체 생성후 setter로 주입 / getter로 필드의 값을 출력
		Member m3 = new Member(10, "sdfk" , "asdfa" ,"aaa@aaa.com" , 20);
		
		// setter
		System.out.println(m3.getMemberAge());
		System.out.println(m3.getMemberEmail());
		System.out.println(m3.getMemberID());
		System.out.println(m3.getMemberNo());
		System.out.println(m3.getMemberPass());
		
	}
	
	
}

