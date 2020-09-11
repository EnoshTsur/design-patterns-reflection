package com.dpreflect.demo.dp.strategy;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NameProviderStrategy {

    private final List<String> names;

    public NameProviderStrategy() {
        this.names = List.of(
                "Efraim",
                "Avi",
                "Leah",
                "Shunit",
                "Almog",
                "Karich"
        );
    }

    public List<String> provide(NameStrategy nameStrategy) {
        return nameStrategy.handle(names);
    }
}

class StMain {

    public static void main(String[] args) {
        NameProviderStrategy nameProvider = new NameProviderStrategy();

        System.out.println(
                nameProvider.provide(new Cool())
        );

        System.out.println(
                nameProvider.provide(new AddKoko())
        );
    }
}

class NameProviderFunction {

    private final List<String> names;

    public NameProviderFunction() {
        this.names = List.of(
                "Efraim",
                "Avi",
                "Leah",
                "Shunit",
                "Almog",
                "Karich"
        );
    }

    public <R> List<R> provide(Function<List<String>, List<R>> nameMapper) {
        return nameMapper.apply(names);
    }

}


class Main {

    public static void main(String[] args) {
        NameProviderFunction nameProvider = new NameProviderFunction();
        System.out.println(
                nameProvider.provide(
                        list -> list.stream()
                                .map(x -> x + "df")
                                .collect(Collectors.toList())
                )
        );

        System.out.println(
                nameProvider.provide(
                        list -> list.stream()
                                .map(String::length)
                                .collect(Collectors.toList())
                )
        );

    }
}

class Generics<BOB, MARLEY> {

    private BOB bob;
    private MARLEY marley;

    public Generics(BOB bob, MARLEY marley) {
        this.bob = bob;
        this.marley = marley;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "bob=" + bob +
                ", marley=" + marley +
                '}';
    }

    public BOB getBob(){
        return bob;
    }

    public void setBob(BOB bob) {
        this.bob = bob;
    }

    public MARLEY getMarley() {
        return marley;
    }

    public void setMarley(MARLEY marley) {
        this.marley = marley;
    }

    public <T> void what(T t) {
        System.out.println(
               "" + t + bob + marley
        );
    }
}


