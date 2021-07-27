package com.kuang.dynamic.demo1;

public class Client {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        pih.getProxy();
    }
}
