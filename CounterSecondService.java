package com.example.lectia40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterSecondService {
    @Autowired
    private SpringCounter springCounter;
    public void afisareContor(){
        System.out.println(springCounter.getCounter());
    }
    public void setSpringCounter(int count){
        springCounter.setCounter(count);
    }
}
