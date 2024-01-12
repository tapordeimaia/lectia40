package com.example.lectia40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lectia40ApplicationTests {

    @Test
    void contextLoads() {
        Calculator calculator = new Calculator();
        int raspuns = calculator.sum(2, 2);
        Assertions.assertEquals(4, raspuns);
    }

}
