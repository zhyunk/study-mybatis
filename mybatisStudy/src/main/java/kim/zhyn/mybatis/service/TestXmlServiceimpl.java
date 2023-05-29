package kim.zhyn.mybatis.service;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import kim.zhyn.mybatis.dto.UserDto;
import kim.zhyn.mybatis.mapper.TestXmlMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TestXmlServiceimpl implements TestService<UserDto> {
    TestXmlMapper testMapper;

    @Override
    public TestDto findByState(int idx) throws Exception {
        return testMapper.findByState(idx);
    }
    @Override
    public List<TestDto> findAll() throws Exception {
        return testMapper.findAll();
    }

    @Override
    public List<UserDto> findAllJoinId() throws Exception {
        return testMapper.findAllJoinId();
    }

    @Override
    public UserDto findByJoinId(int idx) throws Exception {
//        if (idx > testMapper.findAll().size() || idx < 0)
//            return UserDto
//                    .builder()
//                    .idx(0)
//                    .name("❌")
//                    .build();
        return testMapper.findByJoinId(idx);
    }

}
