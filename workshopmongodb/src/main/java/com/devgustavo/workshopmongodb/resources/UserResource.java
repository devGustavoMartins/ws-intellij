package com.devgustavo.workshopmongodb.resources;

import com.devgustavo.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User gustavo = new User("1", "Gustavo Martins", "gustavo@gmail.com");
        User sophia = new User("2", "Sophia Franchi", "sophia@gmail.com");
        List<User> list = new ArrayList<>(Arrays.asList(gustavo, sophia));
        return ResponseEntity.ok().body(list);
    }
}
