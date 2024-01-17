package com.example.lectia40;

import org.springframework.stereotype.Component;

@Component
public class SpringCounter {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
