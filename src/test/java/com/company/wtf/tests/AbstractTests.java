package com.company.wtf.tests;

import org.junit.jupiter.api.BeforeEach;

import java.util.Random;


public class AbstractTests {

    private static Random random = new Random();

    @BeforeEach
    public void doStuff() {
        Long sum = random.longs().limit(400000).sum();
        System.out.println(sum);
    }
}
