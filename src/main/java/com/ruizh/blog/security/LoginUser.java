package com.ruizh.blog.security;

import lombok.Data;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "login_users")
public class LoginUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String userName;

    private String password;

    private boolean active;

//    @ElementCollection(targetClass = LoginRole.class, fetch = FetchType.EAGER)
//    @CollectionTable
//    @Enumerated(EnumType.STRING)
//    private List<LoginRole> roles;
    private String role;
}
