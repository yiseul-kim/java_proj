package Chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
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
	public int hashCode() {
		return Objects.hash(stuID, stuName, stuPhone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuID == other.stuID && Objects.equals(stuName, other.stuName)
				&& Objects.equals(stuPhone, other.stuPhone);
	}
		
	@Override
	public String toString() {
		
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", stuPhone=" + stuPhone + "]" ;
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Set<Student> hset = new HashSet();
		
		// 학생 객체 5개 생성해서 set에 넣을 경우 stuID(고유값) 필드에 중복된 값을 넣지 못하도록 설정
		// stuID 필드의 equals() 재정의, hashCode() 재정의 
		// 완료시간 17:00

		Student s1 = new Student(1111, "김철수", "010-1111-1111");
		Student s2 = new Student(2222, "이철희", "010-2222-2222");
		Student s3 = new Student(2222, "강철민", "010-3333-3333");
		Student s4 = new Student(4444, "박철진", "010-4444-4444");
		Student s5 = new Student(5555, "송철숙", "010-5555-5555");
		
		
		// set에 값을 할당 : hset
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		hset.add(s4);
		hset.add(s5);
		System.out.println(hset.size());
		
		System.out.println(hset);
		System.out.println();
		System.out.println("==== Set에 저장된 값을 출력 : Iterator 사용 ======");
		Iterator <Student> ir = hset.iterator();
		while ( ir.hasNext( ) ) {
			// 방법1
			Student student = ir.next();
			
			System.out.println(student);
			
//			System.out.println((ir.next()).stuID); 
			
			// 방법2			
//			System.out.println(ir.next( ) );
		}
		
		System.out.println("==== Set에 저장된 값을 출력 : Enhanced For 사용 ======");
		for (Student k : hset ) {
			System.out.println(k); 	// 전체 출력
			System.out.println(k.stuID);		//stuID만 출력
		}
		
	}

}
