package org.example;

import ru.netology.sqr.SqrService;

public class Main {
    public static void main(String[] args) {
        int start = 10;
        int finish = 99;

        SqrService service = new SqrService();
        service.calcSqr(10, 99);
    }
}