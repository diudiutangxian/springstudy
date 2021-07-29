package com.kuang.dynamic.demo1;

import org.junit.jupiter.api.Test;

public class Client {
    public static void main(String[] args) {

        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);

        // 动态生成代理角色
        UserService proxy = (UserService) pih.getProxy();
        // 通过代理访问真实角色的方法
        proxy.add();


    }

    /**
     *     如果要去代理UserServiceImpl2 只需要改两行代码即可
     */
    @Test
    public void proxyUserServiceImpl2(){
// 真实角色
        UserServiceImpl2 userService = new UserServiceImpl2();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);

        // 动态生成代理角色
        UserService proxy = (UserService) pih.getProxy();
        // 通过代理访问真实角色的方法
        proxy.add();
    }


}
