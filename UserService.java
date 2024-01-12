package com.example.lectia40;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositoryPaginated userRepositoryPaginated;

    public List<User> getAllUsersPaginated(int page, int pageSize, String name, String role, String sortBy){
        Page<User> userPage;
        Pageable pageable = PageRequest.of(page, pageSize, Sort.Direction.ASC, sortBy);
        if(!role.isBlank() && !name.isBlank()){
            userPage = userRepositoryPaginated.findAllByNameAndRole(pageable, name, role);
        }else if(!name.isBlank()){
            userPage = userRepositoryPaginated.findAllByName(pageable, name);
        }else if (!role.isBlank()){
            userPage = userRepositoryPaginated.findAllByRole(pageable, role);
        } else {
            userPage =  userRepositoryPaginated.findAll(pageable);
        }
        return userPage.getContent();
    }
}
