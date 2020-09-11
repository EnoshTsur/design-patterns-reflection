package com.dpreflect.demo.dp.factory;


public class CompanyFacade implements ClientFacade {
    @Override
    public CompanyFacade login(String email, String password) {
        return !(email.equals("company") && password.equals("123")) ? null :
                        new CompanyFacade();
    }
}
