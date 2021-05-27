package com.ywl.springboot.dao;

import com.ywl.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
