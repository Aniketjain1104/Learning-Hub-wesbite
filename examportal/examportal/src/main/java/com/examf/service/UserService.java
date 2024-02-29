package com.examf.service;

import com.examf.model.User;
import com.examf.model.UserRole;

import java.util.Set;

public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles ) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);
}
