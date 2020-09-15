package com.dpreflect.demo.ref;

import com.dpreflect.demo.dp.factory.AdminFacade;


import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

class Person {

    private String name;
    private String city;

    public Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


public class Main {

    private String name;

    private String getName(){ return  name; }

    public static void main(String[] args) {


        Class<AdminFacade> adminFacadeClass = AdminFacade.class;

//        Class<A> aClass = A.class;

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

//        AdminFacade adminFacade = new AdminFacade();

        try {

//            Constructor<AdminFacade> constructor = AdminFacade.class.getConstructor();
//            AdminFacade adminFromCTR = constructor.newInstance();

            Map<String, String> json = Map.of(
                    "name", "enosh",
                    "city", "rishon",
                    "avner", "yo"
            );


            // instance from default ctr -> person
            Person person = Person.class.getConstructor().newInstance();
            Stream.of(Person.class.getMethods())
                    .filter(method -> method.getName().startsWith("set"))
                    .forEach(setter -> json.forEach((key, value) -> {
                        if (setter.getName().toLowerCase().contains(key)) {
                            try {
                                setter.invoke(person, value);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }));
            System.out.println(person);


            // use setters -> validates keys includes
            // print the instance

            Constructor<AdminFacade> constructor = AdminFacade.class.getConstructor(String.class);
            AdminFacade admin = constructor.newInstance("Enosh");

            Field adminName = AdminFacade.class.getDeclaredField("adminName");
            adminName.setAccessible(true);
            System.out.println(
                    adminName.get(admin)
            );

            // Create instance from Args CTR
            // Get Declared field - name
            // Get Field value for this instance

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }

//        try {
//            Field adminName = AdminFacade.class.getDeclaredField("adminName");
//            adminName.setAccessible(true);
//
//            System.out.println(
//                    adminName.get(adminFacade)
//            );
//
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }


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