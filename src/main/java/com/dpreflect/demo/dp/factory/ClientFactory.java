package com.dpreflect.demo.dp.factory;

import static com.dpreflect.demo.dp.factory.ClientFactory.*;
import static com.dpreflect.demo.dp.factory.ClientType.*;

public class ClientFactory {

    public static ClientFacade getFacade(String name, String password, ClientType type) {
        switch (type) {
            case COMPANY:
                return new CompanyFacade().login(name, password);
            case CUSTOMER:
                return new CustomerFacade().login(name, password);
            case ADMIN:
                return new AdminFacade().login(name, password);
                default:
                    return null;
        }
    }
}



class Main {

    public static void main(String[] args) {
        AdminFacade adminFacade = (AdminFacade) getFacade("admin", "123", ADMIN);

    }
}
