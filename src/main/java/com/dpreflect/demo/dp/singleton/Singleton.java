package com.dpreflect.demo.dp.singleton;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

public final class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


@Service
class DateService {

    public LocalDate getNow() {
        return LocalDate.now();
    }

    public LocalDate nowAfterYears(int years) {
        return LocalDate.now().plusYears(years);
    }

}


@AllArgsConstructor
@RestController
class Controller {

    private final DateService dateService;
}


