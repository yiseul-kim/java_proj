package Chapter08.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private long memberNo;
	private String memberID;
	private String memberPass;
	private String memberEmail;
	private int memberAge;
	
}
