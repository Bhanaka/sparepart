package com.wing.sparepart.Repository;

import com.wing.sparepart.Entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration,Long> {
    UserRegistration findByUsername(String username);
}
