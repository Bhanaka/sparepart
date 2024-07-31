package com.wing.sparepart.Repository;

import com.wing.sparepart.Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserRole,Long> {
}
