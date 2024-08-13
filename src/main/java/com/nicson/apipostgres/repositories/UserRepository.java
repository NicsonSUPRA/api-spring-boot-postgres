package com.nicson.apipostgres.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nicson.apipostgres.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findByNameIgnoreCaseContaining(String name);
}
