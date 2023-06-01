package Chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


class Member {
	String memberID;				// 식별자 equals(), hashCode()
	String memberName;
	
	// 생성자를 통해서 필드의 값 입력
	Member(String memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// 객체를 출력시 필드의 내용을 출력 
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

	// set의 중복된 값을 식별 : equals() , hashCode() // ctrl+alt+s
	@Override
	public int hashCode() {
		return Objects.hash(memberID, memberName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(memberID, other.memberID) && Objects.equals(memberName, other.memberName);
	}
	
}	


class MemberMethod {	
	// Set을 정의 
	Set<Member> memSet ;
	// MemberMethod 객체를 생성시 Set을 활성화 시킴.
	MemberMethod () {		// 기본생성자 
		this.memSet = new HashSet();
	}
	
	// 메소드를 정의 : member객체를 받음.
	public void addMember(Member	member) {		//Member객체를 인풋으로 던지면 set에 저장 
		// 코드 작성
		memSet.add(member);
	}
	// 정수를 받음 : memberID ==> set => Member => memberID 	: 인풋받은 멤버 ID를 삭제 시킴
	public boolean removeMember(String memberID) {
		// 코드작성
		Iterator ir = memSet.iterator();
		while (ir.hasNext()) {
			Member member = (Member) ir.next();
			if(memberID ==member.memberID) {
				memSet.remove(member);
				return true;
			} return false;
		}
		System.out.println("회원님의 아이디는 검색 되지 않았습니다. ");
		return true;		// 삭제가 잘 완료된 경우, 해당 ID가 존재하지 않는 경우 return false
	}
	// 메소드 호출시 set안에 저장된 Member객체의 필드의 값을 출력 
	public void showMember() {	
		Iterator ir = memSet.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}
	// Set에 저장된 총 갯수를 출력 
	public void showSize() {
		System.out.println("Set에 저장된 총 갯수는 : "+memSet.size());
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// 객체 5개 생성
		Member m1 = new Member("1111", "홍길동");
		Member m2 = new Member("2222", "홍길순");
		Member m3 = new Member("3333", "홍길훈");
		Member m4 = new Member("4444", "홍길자");
		Member m5 = new Member("4444", "홍길철");
		Member m6 = new Member("3333", "홍길숙");
		
		// MemberMethod객체 생성 후, 메소드를 만들어서 호출 set에 객체 저장( 저장, 삭제, 출력)
		MemberMethod mm = new MemberMethod();		// 객체를 생성해야 호출이 가능함
		
		mm.addMember(m1);
		mm.addMember(m2);
		mm.addMember(m3);
		mm.addMember(m4);
		mm.addMember(m5);
		mm.addMember(m6);
		
		// Set에 저장된 총 개수
		mm.showSize();
		System.out.println(" ============");
		// set에 저장된 멤버 객체를 출력 
		mm.showMember();
		// 
		mm.removeMember("2222");
		
	}

}
