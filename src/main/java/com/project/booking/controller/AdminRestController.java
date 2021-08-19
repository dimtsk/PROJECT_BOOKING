package com.project.booking.controller;

import com.project.booking.model.User;
import com.project.booking.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
    
    public static final String DEFAULT_ROLE = "ROLE_USER";
    public static final String[] ADMIN_ACCESS = {"ROLE_ADMIN", "ROLE_MODERATOR"};
    public static final String[] MODERATOR_ACCESS = {"ROLE_MODERATOR"};
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/list")
    public List<User> loadUsers(){
        return userRepository.findAll();
    }

}
