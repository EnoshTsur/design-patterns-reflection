package com.dpreflect.demo.dp.builder;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private Gender gender;
    private int age;
    private Address address;
    private Car car;


}

class Main {

    public static void main(String[] args) {

        Person p = Person.builder()
                .age(23)
                .name("yossi")
                .build();

        Person c = Person.builder()
                .gender(Gender.FEMAILE)
                .name("leah")
                .build();
    }
}
