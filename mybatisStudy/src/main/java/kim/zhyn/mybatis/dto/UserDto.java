package kim.zhyn.mybatis.dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserDto {

    int idx;
    String name;

    // xml mapper에서 사용
    private TestDto testDto;
}
