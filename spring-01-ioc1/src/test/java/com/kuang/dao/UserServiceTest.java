package com.kuang.dao;

import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
//    @Test
//    public void test(){
//        UserService userService = new UserServiceImpl();
//        userService.setUserDao(new UserMysqlDaoImpl());
//        userService.getUser();
//    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.getUser();
    }
}
