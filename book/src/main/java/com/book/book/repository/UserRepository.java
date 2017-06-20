package com.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.book.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
