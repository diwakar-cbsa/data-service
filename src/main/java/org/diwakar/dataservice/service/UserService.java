package org.diwakar.dataservice.service;

import org.diwakar.dataservice.dao.UserDao;
import org.diwakar.dataservice.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserDao userDao;

  @Autowired
  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public UserEntity getUser(String email) {
    return userDao.findByEmail(email);
  }

  public UserEntity create(UserEntity user) {
    return userDao.save(user);
  }
}
