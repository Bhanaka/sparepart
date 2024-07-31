package com.wing.sparepart.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "user_registrations")
public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String firstname;
    @Column()
    private String lastname;
    @Column()
    private String username;
    @ManyToOne
    @JoinColumn(name = "userrole_id", nullable = false)
    private UserRole role;
    @Column()
    private String email;
    @Column()
    private String contactno;
    @Column()
    private Boolean status ;
    @Column()
    private LocalDateTime registrationDate;

}
