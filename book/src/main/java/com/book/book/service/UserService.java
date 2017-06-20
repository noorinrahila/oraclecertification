package com.book.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userrepo;
}
