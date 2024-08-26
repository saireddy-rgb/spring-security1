package com.saireddy.security1.service;

import com.saireddy.security1.model.UserPrincipal;
import com.saireddy.security1.model.Users;
import com.saireddy.security1.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService  implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByusername(username);
        if(user==null){
            System.out.println("the user is not found");
            throw new UsernameNotFoundException("user is not found");
        }
        return new UserPrincipal(user);
    }


}
