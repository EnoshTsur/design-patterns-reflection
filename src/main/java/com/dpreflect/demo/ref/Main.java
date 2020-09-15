package com.dpreflect.demo.ref;

import com.dpreflect.demo.dp.factory.AdminFacade;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

final class A {

}


public class Main {

    private String name;

    private String getName(){ return  name; }

    public static void main(String[] args) {

        Class<AdminFacade> adminFacadeClass = AdminFacade.class;

        Class<A> aClass = A.class;

//        System.out.println(
//                adminFacadeClass.getName()
//        );

//        System.out.println(
//                adminFacadeClass.getSimpleName()
//        );

        // 3
//        int modifierStatus = aClass.getModifiers();
//
//        System.out.println(
//                Modifier.isAbstract(modifierStatus)
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

//        Method[] methods = adminFacadeClass.getDeclaredMethods();
//        Stream.of(methods)
//                .map(Method::getName)
//                .forEach(System.out::println);

        AdminFacade adminFacade = new AdminFacade();


//
//        try {
//
//            Method hello = AdminFacade.class.getMethod("hello", String.class);
//            Method secret = AdminFacade.class.getDeclaredMethod("secret");
//
//            secret.setAccessible(true);
//            secret.invoke(adminFacade, null);
//
//            System.out.println(
//                    Arrays.toString(hello.getParameterTypes()) + "\n" + hello.getParameterCount()
//            );
//
//        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        }


    }
}