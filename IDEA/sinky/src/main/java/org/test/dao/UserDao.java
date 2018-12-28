package org.test.dao;

import org.test.po.UserInfo;

import java.util.List;

public interface UserDao {
    public List<UserInfo> findAllUsers();
    public UserInfo findById(Long id);
}
