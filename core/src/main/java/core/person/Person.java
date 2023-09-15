package core.person;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//import lombok.Data;

@Getter@Setter
@ToString//(exclude = "address")
@NoArgsConstructor // 기본생성자
@AllArgsConstructor// 모든 파라미터 생성자
@EqualsAndHashCode
//@Data -> 실무에서 잘 안쓴대용(세부설정 불가로 정보노출의 위험)
public class Person {
	
	private String nickname;
	private String address;
	private int age;
	
	
}
