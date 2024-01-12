package com.example.lectia40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public void addPerson(String name){
        personRepository.addPerson(name);
    }
    public List<String> getPersonList(){
        return personRepository.getPersonList();
    }
}
