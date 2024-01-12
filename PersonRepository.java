package com.example.lectia40;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {
    List<String> names = new ArrayList<>();
    public void addPerson(String name){
        names.add(name);
    }

    public List<String> getPersonList(){
        return names;
    }
}
