package com.example.lectia40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersonServiceTest {
    @Autowired
    PersonService personService;
    @Test
    public void testCreatePerson(){
        personService.addPerson("Ion");
        List<String> people = personService.getPersonList();
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals("Ion", people.get(0));
    }
}
