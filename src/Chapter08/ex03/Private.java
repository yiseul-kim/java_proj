package Chapter08.ex03;

class Student {			//default : 외부 패키지에서 접근이 불가능함. 
	
	// 외부에서 접근이 불가한 필드, 외부 클래스에서 필드에 직접 값을 접근할 수 없도록 설정. 
	private String stuName;		// <==
	private String stuAddr;		// <==
	private int Age;
	private double weight;
	
	// getter, setter 를 사용해서 : 접근 지정자를 public 으로 지정한다.  
		//private 필드에 값을 넣고(setter) 
		//불러오도록(getter) 한다.
	
	//stuName 필드에 대한 getter : 필드의 값을 리턴
	public String getStudName()	{
		return stuName;
	}
	
	//stuName 필드에 대한 setter : 필드의 값을 외부에서 주입
	
	public void setStuName(String stuName ) {
		this.stuName = stuName;
	}
	
	//getter
	public String getStuAddr() {
		return stuAddr;
	}
	
	//setter
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	
	// getter : age 필드에 대한 
	public int getAge () {
		return Age;
	}
	//setter : age 필드에 대한 
	public void setAge(int Age ) {
		this.Age = Age;
	}
	
	// getter : weight에 대한
	public double getWeight() {
		return weight;
	}
	//setter : weight 에 대한 
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

public class Private {
	public static void main(String[] args) {
	
		Student s1 = new Student ();
		
		// private 필드에 직접 접근 불가 : 외부 클래스에서 - getter, setter를 사용  
//		s1.stuName() = "홍길동";				// private 
//		System.out.println(s1.stuName);		// private
		
//		getter를 사용해서 필드의 내용을 출력 
		
		System.out.println(s1.getStudName());

//		setter를 사용해서 필드의 내용을 입력
		
		s1.setStuName("홍길동");
		System.out.println(s1.getStudName());
		
		//setter를 사용해서 필ㄷ의 값입력
		s1.setStuAddr("서울");
		s1.setAge(25);
		s1.setWeight(75.5);
	
		System.out.println("=============================");
		
		System.out.println(s1.getStuAddr());
		System.out.println(s1.getAge());
		System.out.println(s1.getWeight());
	}

}
