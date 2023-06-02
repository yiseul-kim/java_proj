package Chapter17.ex04;

import java.util.Set;
import java.util.TreeSet;

class Aa implements Comparable <Aa>{		// 일반 객체를 TreeSet에 넣어서 정렬해서 출력: Comparable 인터페이스의 compareTo() 재정의
	String name ;	
	
	// 생성자를 통해서 필드에 값 입력 	
	Aa(String name ) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Aa o) {
		return (this.name.compareTo(o.name));
	}
	@Override
	public String toString() {		
		return " "+ name+" ";
	}
}
class Bb implements Comparable<Bb>{
	Integer userID;

	Bb(Integer userID) {
		this.userID = userID;
	}
	@Override
	public int compareTo(Bb o) {		
//		return (this.userID.compareTo(o.userID));
	// 내림차순 정렬 정의
	if ( this.userID < o.userID ) {
		return 1;
	}else if (this.userID == o.userID ) {
		return 0;
	}else { 
		return -1;
	}
	}
	@Override
	public String toString() {
		return " "+ userID + " ";
	}

}
public class Ex03 {

	public static void main(String[] args) {
		// 두 클래스를 TreeSet에 저장시 정렬되어 출력되도록 구현
		// 45분까지 
		Set<Aa> aaSet = new TreeSet( ) ;
		aaSet.add(new Aa("A"));	aaSet.add(new Aa("B"));	aaSet.add(new Aa("C"));
		aaSet.add(new Aa("D"));	aaSet.add(new Aa("E"));	aaSet.add(new Aa("F"));
		
		System.out.println(aaSet);
		
		Set<Bb> bbSet = new TreeSet( ) ;
		bbSet.add(new Bb(1)); 		bbSet.add(new Bb(2)); 		bbSet.add(new Bb(3)); 		
		bbSet.add(new Bb(4)); 		bbSet.add(new Bb(5)); 		bbSet.add(new Bb(6)); 		
	
		System.out.println(bbSet);
	}
	

}
