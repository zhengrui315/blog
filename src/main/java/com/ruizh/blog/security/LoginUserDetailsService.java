package com.ruizh.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginUserDetailsService implements UserDetailsService {
    @Autowired
    LoginUserRepository loginUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        Optional<LoginUser> loginUser = loginUserRepository.findByUserName(userName);
//        loginUser.orElseThrow(() -> new UsernameNotFoundException("Couldn't find " + userName + "!"));

//        return loginUser.map(LoginUserDetails::new).get();

        return new LoginUserDetails((loginUserRepository.findByUserName(userName)));
    }
}
