package Chapter08.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

	private long memberNo;
	private String memberID;
	private String memberPass;
	private String memberEmail;
	private int memberAge;
	
}
