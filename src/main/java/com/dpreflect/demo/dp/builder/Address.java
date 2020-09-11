package com.dpreflect.demo.dp.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {

    private String country;
    private String city;
    private String street;
    private int number;
}
