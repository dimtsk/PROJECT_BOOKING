package com.project.booking.repository;

import com.project.booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long>{
    
    @Query("SELECT user FROM User user WHERE user.email=?1")
    User findByEmail(String email);
    
}
