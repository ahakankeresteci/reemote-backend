package com.example.reemote.dao;


import com.example.reemote.entityModel.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:8080")
public interface UserRepo extends MongoRepository<User,String>{
  
    
}
