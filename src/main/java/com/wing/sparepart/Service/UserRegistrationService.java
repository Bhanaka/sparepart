package com.wing.sparepart.Service;

import com.wing.sparepart.Entity.UserRegistration;
import com.wing.sparepart.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    @Autowired
    UserRegistrationRepository userRegistrationRepository ;
    public UserRegistration saveUser(UserRegistration userRegistration){
        return userRegistrationRepository.save(userRegistration) ;
    }
    public boolean authenticate(String userName ,String userPassword ) {
        String username = "";
        UserRegistration userRegistration =userRegistrationRepository.findByUsername(username );
         return true;

    }
}
