package com.sha.springbootdeviceseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name= "users")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name= "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name= "password", nullable = false, length = 100)
    private String password;

    @Column(name= "name", nullable = false, length = 100)
    private String name;

    @Column(name= "create_name", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
