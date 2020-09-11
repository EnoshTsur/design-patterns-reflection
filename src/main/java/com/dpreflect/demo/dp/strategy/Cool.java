package com.dpreflect.demo.dp.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class Cool implements NameStrategy {

    @Override
    public List<String> handle(List<String> content) {

        return content.stream()
                .filter(str -> str.contains("e"))
                .map(str -> str + " cool")
                .collect(Collectors.toList());
    }
}
