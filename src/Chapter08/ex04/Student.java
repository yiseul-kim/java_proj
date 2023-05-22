package Chapter08.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class Student {

	private String stuName;
	private String stuEmail;
	private int stuAge;
	private double stuWeight;
	
	// Lombok 어노테이션 (@)
		//@Getter	: 클래스 하위의 모든 필드에 대해서 getter를 자동으로 만듬.
		//@Setter	: 						   setter
		//@ToString : 						   toString
		//@NoArgsConstructor : 기본 생성자를 자동으로 만듬.
		//@Data : 위의 모든 어노테이션을 포함.
	
		//@AllArgsConstructor : 모든 생성자를 자동으로 만듬
	
	
		//getter로 필드의 정볼르 출력
	}
