package kim.zhyn.mybatis.mapper;

import kim.zhyn.mybatis.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestXmlMapper {

    TestDto findByState(int idx) throws Exception;
    List<TestDto> findAll() throws Exception;

}
