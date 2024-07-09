package com.bcd.springjwt.repository;

import com.bcd.springjwt.aggregate.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {


}
