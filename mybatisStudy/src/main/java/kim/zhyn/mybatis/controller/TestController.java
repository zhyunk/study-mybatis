package kim.zhyn.mybatis.controller;

import kim.zhyn.mybatis.dto.TestDto;
import kim.zhyn.mybatis.dto.TestWithUserDto;
import kim.zhyn.mybatis.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class TestController {
    TestService service;

    @GetMapping("/")
    public List<TestDto> get1() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{idx}")
    public TestDto get2(@PathVariable int idx) throws Exception {
        return service.findByState(idx);
    }

    @GetMapping("/user")
    public List<TestWithUserDto> get3() throws Exception {
        return service.findAllJoinId();
    }

    @GetMapping("/user/{idx}")
    public TestWithUserDto get3(@PathVariable int idx) throws Exception {
        return service.findByJoinId(idx);
    }
}
