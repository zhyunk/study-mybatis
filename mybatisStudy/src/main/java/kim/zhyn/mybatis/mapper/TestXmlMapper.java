package kim.zhyn.mybatis.mapper;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import kim.zhyn.mybatis.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestXmlMapper {

    TestDto findByState(int idx) throws Exception;
    List<TestDto> findAll() throws Exception;
    List<UserDto> findAllJoinId();
    UserDto findByJoinId(int idx);

}
