package com.wing.sparepart.Service;

import com.wing.sparepart.Entity.UserRole;
import com.wing.sparepart.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserRole> getAllUsers() {
        return userRepository.findAll();
    }
}
