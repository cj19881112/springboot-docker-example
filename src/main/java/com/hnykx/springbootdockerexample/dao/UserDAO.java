package com.hnykx.springbootdockerexample.dao;

import com.hnykx.springbootdockerexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
}
