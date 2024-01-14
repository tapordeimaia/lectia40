package com.example.lectia40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void addUser(){
        User user = new User("Andrei", "Admin");
        userService.createUser(user);
    }
    @Test
    public void getAllUsers(){
        userService.createUser(new User("Vlad", "Admin"));
        List<User> users = userService.getAllUsers();
        Assertions.assertEquals(1, users.size());
        Assertions.assertEquals("Vlad", users.get(0).getName());
        Assertions.assertEquals("Admin", users.get(0).getRole());
    }
}
