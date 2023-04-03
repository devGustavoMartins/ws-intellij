package com.devgustavo.workshopmongodb.services;

import com.devgustavo.workshopmongodb.domain.User;
import com.devgustavo.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
