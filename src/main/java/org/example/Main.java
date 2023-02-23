package org.example;

import ru.netology.javaqa.javaqamvn.services.RestModel;

public class Main {
    public static void main(String[] args) {
        RestModel service = new RestModel();

        System.out.println(service.calculate(10000, 3000, 20000));
        System.out.println(service.calculate(100000, 60000, 150000));
    }
}