package kim.zhyn.mybatis.service;

import kim.zhyn.mybatis.dto.TestDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestService<T> {

    TestDto findByState(@Param("idx") int idx) throws Exception;
    List<TestDto> findAll() throws Exception;
    List<T> findAllJoinId() throws Exception;
    T findByJoinId(int idx) throws Exception;

}
