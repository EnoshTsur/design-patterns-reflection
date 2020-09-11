package com.dpreflect.demo.dp.factory;


import javax.swing.*;

public class AdminFacade implements ClientFacade {

    @Override
    public AdminFacade login(String email, String password) {
        return !(email.equals("admin") && password.equals("123")) ? null :
                        new AdminFacade();
    }

}
