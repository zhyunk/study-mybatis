package kim.zhyn.mybatis.controller;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import kim.zhyn.mybatis.dto.UserDto;
import kim.zhyn.mybatis.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class TestController {
    TestService<TestWithUserDto> testService;
    TestService<UserDto> testXmlService;

    @GetMapping("/")
    public List<TestDto> get1() throws Exception {
        return testService.findAll();
    }

    @GetMapping("/{idx}")
    public TestDto get2(@PathVariable int idx) throws Exception {
        return testService.findByState(idx);
    }

    @GetMapping("/user")
    public List<TestWithUserDto> get3() throws Exception {
        return testService.findAllJoinId();
    }

    @GetMapping("/user/{idx}")
    public TestWithUserDto get3(@PathVariable int idx) throws Exception {
        return testService.findByJoinId(idx);
    }

    @GetMapping("/xml/user")
    public List<UserDto> get4() throws Exception {
        return testXmlService.findAllJoinId();
    }

    @GetMapping("/xml/user/{idx}")
    public UserDto get5(@PathVariable int idx) throws Exception {
        return testXmlService.findByJoinId(idx);
    }

}
