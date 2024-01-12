package com.example.lectia40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @PostMapping
    public void createUser(@RequestBody User user){
        userRepository.save(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/paginated")
    public List<User> getAllUserPaginated(@RequestParam int page,
                                          @RequestParam int pageSize,
                                          @RequestParam(defaultValue = "") String name,
                                          @RequestParam(defaultValue = "") String role,
                                          @RequestParam(defaultValue = "sortBy") String sortBy){
        System.out.println(page);
        System.out.println(pageSize);
        System.out.println(name);
        System.out.println(role);
        return userService.getAllUsersPaginated(page, pageSize, name, role, sortBy);
    }
}
