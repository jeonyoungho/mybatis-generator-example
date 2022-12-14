package com.example.mybatispractice.service;

import com.example.mybatispractice.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public List<HashMap<String, Object>> getUsers() {
        return userMapper.selectUsers();
    }
}
