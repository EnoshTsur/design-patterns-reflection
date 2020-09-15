package com.dpreflect.demo.dp.factory;


import javax.swing.*;

public class AdminFacade implements ClientFacade {

    private String adminName = "Jacob";

    public AdminFacade(){
        System.out.println("Default ctr!");
    }

    public AdminFacade(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public AdminFacade login(String email, String password) {
        return !(email.equals("admin") && password.equals("123")) ? null :
                        new AdminFacade();
    }

    public String hello(String name){
        return "hello " + name;
    }

    private void secret(){
        System.out.println("Private!!! :)");
    }

}
