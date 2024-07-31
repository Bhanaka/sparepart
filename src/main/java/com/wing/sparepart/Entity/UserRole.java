package com.wing.sparepart.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name="user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String rolename;
    @Column()
    private Integer rolevalue;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserRegistration> users = new HashSet<>();
    @Column
    private Boolean status ;

}
