package com.nicson.apipostgres.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicson.apipostgres.models.User;
import com.nicson.apipostgres.repositories.UserRepository;
import com.nicson.apipostgres.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(long id) throws Exception {
        try {
            Optional<User> user = repository.findById(id);
            return user.get();

        } catch (NoSuchElementException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    public List<User> findByName(String name) {
        return repository.findByNameIgnoreCaseContaining(name);
    }

}
