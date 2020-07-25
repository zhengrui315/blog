package com.ruizh.blog.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser, Integer> {
    @Query("SELECT e FROM LoginUser e WHERE e.userName = ?1")
    LoginUser findByUserName(String userName);
//    Optional<LoginUser> findByUserName(String userName);
}
