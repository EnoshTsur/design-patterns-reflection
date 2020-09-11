package com.dpreflect.demo.ref;

import com.dpreflect.demo.dp.factory.AdminFacade;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

final class A {

}

public class Main {


    public static void main(String[] args) {

        Class<AdminFacade> adminFacadeClass = AdminFacade.class;
        Class<A> aClass = A.class;

//        System.out.println(
//                adminFacadeClass.getName()
//        );

//        System.out.println(
//                adminFacadeClass.getSimpleName()
//        );

//        int modifierStatus = aClass.getModifiers();
//        System.out.println(
//                Modifier.isFinal(modifierStatus)
//        );

//        Class<?>[] interfaces = adminFacadeClass.getInterfaces();
//        Stream.of(interfaces)
//                .map(Class::getSimpleName)
//                .forEach(System.out::println);
//
//        Class<? super AdminFacade> superclass = adminFacadeClass.getSuperclass();
//        System.out.println(
//                superclass.getSimpleName()
//        );

//        Method[] methods = adminFacadeClass.getMethods();
//        Stream.of(methods)
//                .map(Method::getName)
//                .forEach(System.out::println);


    }
}
