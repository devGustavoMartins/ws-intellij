package com.devgustavo.workshopmongodb.config;

import com.devgustavo.workshopmongodb.domain.User;
import com.devgustavo.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        User gustavo = new User(null, "Gustavo Martins", "gustavo@gmail.com");
        User sophia = new User(null, "Sophia Franchi", "sophia@gmail.com");
        User enrico = new User(null, "Enrico Marcassa", "enrico@gmail.com");
        userRepository.saveAll(Arrays.asList(gustavo, sophia, enrico));
    }
}
