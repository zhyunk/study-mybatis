package kim.zhyn.mybatis.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class TestWithUserDto {

    int idx;
    String name;
    String description;

}
