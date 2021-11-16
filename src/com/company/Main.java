package com.company;

import java.*;

public class Main {

    public static void main(String[] args) {
        Flower flower1 = new Flower("Роза", "Красный");
        Flower flower2 = new Flower("Тюльпан", "Белый");

        System.out.println(flower1);
        System.out.println(flower2);

        flower1.blossom();
        flower2.wilt();
        flower1.color();

        System.out.println(flower1.equals(flower2));
    }
}

