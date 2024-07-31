package com.wing.sparepart.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_login")
@Getter
@Setter
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String username;
    @Column()
    private String userpassword;
    @Column()
    private LocalDateTime loginDate;

}
