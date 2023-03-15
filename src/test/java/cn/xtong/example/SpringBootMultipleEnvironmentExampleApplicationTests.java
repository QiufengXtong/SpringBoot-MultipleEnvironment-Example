package cn.xtong.example;

import cn.xtong.example.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootMultipleEnvironmentExampleApplicationTests {

    @Resource
    private User user;

    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
