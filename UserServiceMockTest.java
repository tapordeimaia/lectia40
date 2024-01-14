package com.example.lectia40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class UserServiceMockTest {
    @Autowired
    UserService userService;
    @MockBean
    UserRepository userRepository;
    @Test
    public void testGetUser(){
        User user = new User("Ion", "Admin");
        Mockito.when(userRepository.findByName("Ion")).thenReturn(user);
        User response = userService.getUserByName("Ion");
        Assertions.assertEquals("Ion", response.getName());
        Assertions.assertEquals("Admin", response.getRole());
    }

    public void createUser(){
        Mockito.when(userRepository.save(any())).thenReturn(new User("David", "Admin"));
        User user = new User("David", "Admin");
        User response = userService.createUser(user);

    }
}
