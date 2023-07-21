package org.diwakar.dataservice.dao;

import org.diwakar.dataservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Long> {

  UserEntity findByEmail(String email);
}
