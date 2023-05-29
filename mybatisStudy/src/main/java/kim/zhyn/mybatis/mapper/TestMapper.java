package kim.zhyn.mybatis.mapper;

import kim.zhyn.mybatis.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM TB_TEST WHERE idx = 1")
    TestDto findByState(@Param("idx") int idx);

    @Select("SELECT * FROM TB_TEST ")
    List<TestDto> findAll();
}
