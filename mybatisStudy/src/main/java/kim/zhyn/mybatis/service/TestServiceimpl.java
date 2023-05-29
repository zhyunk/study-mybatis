package kim.zhyn.mybatis.service;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import kim.zhyn.mybatis.mapper.TestMapper;
import kim.zhyn.mybatis.mapper.TestXmlMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TestServiceimpl implements TestService {
    TestMapper testMapper;
//    TestXmlMapper testMapper;

    @Override
    public TestDto findByState(int idx) throws Exception {
        return testMapper.findByState(idx);
    }
    @Override
    public List<TestDto> findAll() throws Exception {
        return testMapper.findAll();
    }

    @Override
    public List<TestWithUserDto> findAllJoinId() throws Exception {
        return testMapper.findAllJoinId();
    }

    @Override
    public TestWithUserDto findByJoinId(int idx) throws Exception {
        if (idx > testMapper.findAll().size())
            return TestWithUserDto
                    .builder()
                    .idx(0)
                    .name("")
                    .description("없는 번호 ❌")
                    .build();
        return testMapper.findByJoinId(idx);
    }
}
