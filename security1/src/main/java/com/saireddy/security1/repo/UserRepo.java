package com.saireddy.security1.repo;


import com.saireddy.security1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

    Users findByusername(String username);

}
