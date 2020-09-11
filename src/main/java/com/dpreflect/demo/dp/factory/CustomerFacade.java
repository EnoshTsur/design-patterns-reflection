package com.dpreflect.demo.dp.factory;


public class CustomerFacade implements ClientFacade {

    @Override
    public CustomerFacade login(String email, String password) {
        return !(email.equals("customer") && password.equals("123")) ? null :
                        new CustomerFacade();
    }
}

/*

class ClientFactory {


    static ClientFacade ( email, password, clientType )
}

 */
