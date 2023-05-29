package kim.zhyn.mybatis.service;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestService {

    TestDto findByState(@Param("idx") int idx) throws Exception;
    List<TestDto> findAll() throws Exception;
    List<TestWithUserDto> findAllJoinId() throws Exception;
    TestWithUserDto findByJoinId(int idx) throws Exception;

}
