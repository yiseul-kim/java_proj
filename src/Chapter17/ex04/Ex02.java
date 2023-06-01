package Chapter17.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Student {
	int stuID;				// 식별자 : 
	String stuName;
	String stuPhone;
	
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student ) {
			if( this.stuID ==((Student)obj).stuID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}
	@Override
	public String toString() {
		return " " + stuID  +" "+ stuName + " " +stuPhone + " \n" ;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Student> hset = new HashSet();
		
		// 학생 객체 5개 생성해서 set에 넣을 경우 stuID(고유값) 필드에 중복된 값을 넣지 못하도록 설정
		// stuID 필드의 equals() 재정의, hashCode() 재정의 
		// 완료시간 17:00

		hset.add(new Student(1111, "김철수", "010-1111-1111"));
		hset.add(new Student(2222, "이철희", "010-2222-2222"));
		hset.add(new Student(2222, "강철민", "010-3333-3333"));
		hset.add(new Student(4444, "박철진", "010-4444-4444"));
		hset.add(new Student(5555, "송철숙", "010-5555-5555"));
		
		System.out.println(hset);
		System.out.println(hset.size());
		
		
	}

}
