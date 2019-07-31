package com.jzl.service;

import com.jzl.entity.TUser;
import com.jzl.pojo.ResultBean;
import com.jzl.userapi.IUserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() {

        TUser user = new TUser();
        user.setFlag(true);
        user.setUsername("admin");
        user.setPassword("123456");
        user.setEmail("512134012@qq.com");
        user.setPhone("13590385478");

        ResultBean resultBean = userService.addUser(user);
        System.out.println(resultBean.getStatusCode());
    }

}
