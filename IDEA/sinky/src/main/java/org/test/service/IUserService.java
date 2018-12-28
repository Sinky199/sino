package org.test.service;

import org.test.po.UserInfo;

import java.util.List;

public interface IUserService {

    public List<UserInfo> getAllUsers();

    public UserInfo findById(Long id);
}
