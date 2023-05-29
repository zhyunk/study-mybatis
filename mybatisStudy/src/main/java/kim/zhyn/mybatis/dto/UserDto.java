package kim.zhyn.mybatis.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {

    int idx;
    String name;

    // xml mapper에서 사용
    private TestDto testDto;

}
