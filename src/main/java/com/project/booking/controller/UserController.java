package com.project.booking.controller;

import com.project.booking.model.User;
import com.project.booking.repository.UserRepository;
import com.project.booking.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    public static final String DEFAULT_ROLE = "ROLE_USER";
//    public static final String[] ADMIN_ACCESS = {"ROLE_ADMIN", "ROLE_MODERATOR"};
//    public static final String[] MODERATOR_ACCESS = {"ROLE_MODERATOR"};

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/register")
    public String registerForm(ModelMap mm) {
        mm.addAttribute("user", new User());
        return "LoginForm";
    }

    @PostMapping("/process/registration")
    public String registerUser(User user, ModelMap mm) {
        List<User> userList=userService.getListOfUsers();
        for(User u:userList){
            if(user.getEmail().equals(u.getEmail())){
                mm.addAttribute("messageoutput", "This Email already exists");
                return "LoginForm";
            }
        }
        user.setRole(DEFAULT_ROLE);
        String encryptPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptPassword);
        userService.createUserAccount(user);
        return user.getFirstname() + " " + user.getLastname() + " Welcome!";
    }

}
