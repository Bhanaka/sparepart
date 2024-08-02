package com.wing.sparepart.Service;

import com.wing.sparepart.Entity.UserRegistration;
import com.wing.sparepart.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    @Autowired
    UserRegistrationRepository userRegistrationRepository ;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public UserRegistration saveUser(UserRegistration userRegistration){
        return userRegistrationRepository.save(userRegistration) ;
    }
    public UserRegistration authenticate(String userName ,String userPassword ) {
        String username;
        username = userName;

        UserRegistration userRegistration =userRegistrationRepository.findByUsername(username );
        if (userRegistration != null &&
                passwordEncoder.matches(userPassword, userRegistration.getPassword())) {
            return userRegistration;
        }
        return null;
    }
}
