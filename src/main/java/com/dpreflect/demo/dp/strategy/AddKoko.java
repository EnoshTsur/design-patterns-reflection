package com.dpreflect.demo.dp.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class AddKoko implements NameStrategy {

    @Override
    public List<String> handle(List<String> content) {
        return content.stream()
                .map(str -> str + " koko")
                .collect(Collectors.toList());
    }
}
