package org.test.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.dao.UserDao;
import org.test.po.UserInfo;
import org.test.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class UserService implements IUserService{

    @Resource
    private UserDao userDao;

    @Override
    public List<UserInfo> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public UserInfo findById(Long id) {
        return userDao.findById(id);
    }
}
