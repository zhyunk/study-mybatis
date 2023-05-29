package kim.zhyn.mybatis.mapper;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import kim.zhyn.mybatis.mapper.sql.TestSql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM TB_TEST WHERE idx = #{idx}")
    TestDto findByState(@Param("idx") int idx);

    @Select("SELECT * FROM TB_TEST ")
    List<TestDto> findAll();

    @Select(TestSql.ALL_TEST_WITH_USER)
    List<TestWithUserDto> findAllJoinId();

    @SelectProvider(type = TestSql.class , method = "findByJoinId")
    TestWithUserDto findByJoinId(int idx);

}
