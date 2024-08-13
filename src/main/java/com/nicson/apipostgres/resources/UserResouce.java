package com.nicson.apipostgres.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicson.apipostgres.models.User;
import com.nicson.apipostgres.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        List<User> users = service.findAll();
        return ResponseEntity.ok().body(users);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> findById(@PathVariable Long id) throws Exception {
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @RequestMapping(value = "/namesearch", method = RequestMethod.GET)
    public ResponseEntity<List<User>> findByName(@RequestParam(value = "name", defaultValue = "") String name) {
        List<User> list = service.findByName(name);
        return ResponseEntity.ok().body(list);
    }

}
