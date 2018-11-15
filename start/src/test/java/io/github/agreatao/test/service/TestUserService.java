package io.github.agreatao.test.service;

import io.github.agreatao.modules.business.repository.entity.User;
import io.github.agreatao.modules.business.serivce.UserService;
import io.github.agreatao.start.AgreataoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AgreataoApplication.class)
public class TestUserService {

    @Autowired
    private UserService userService;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testSave() {
        User user = new User();
        user.setName("xuao");
        user.setBirth(new Date(System.currentTimeMillis()));
        user.setPhone("18667198030");
        user.setPassword("123456");
        userService.save(user);
        logger.info(user.toString());
    }

}
