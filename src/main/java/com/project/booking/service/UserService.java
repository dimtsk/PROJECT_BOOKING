
package com.project.booking.service;


import com.project.booking.model.User;
import com.project.booking.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public void createUserAccount(User user){
        userRepository.save(user);
    }
    
    public List<User> getListOfUsers(){
        return userRepository.findAll();
    }
    
}
