package com.user.job.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.job.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
