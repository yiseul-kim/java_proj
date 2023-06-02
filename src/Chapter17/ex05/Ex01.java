package Chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Student { //map의 key 중복되지 않도록 처리해줘야함. 두개를 equals, hashCode() overiding
	int stuID;	
	String stuName;
	
	@Override
		public String toString() {
			return " "+stuID+" "+stuName;
		}

	@Override
	public int hashCode() {
		return Objects.hash(stuID, stuName);
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
		return stuID == other.stuID;
	}
	
	
}

public class Ex01 {
	public static void main(String[] args) {
		//key : Student, 		
		Map <Student, String> linkMap = new LinkedHashMap();
		
		linkMap.put(    , "65");	

		System.out.println(linkMap);
	}

}
