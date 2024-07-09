package com.bcd.springjwt.domain.user.repository;

import com.bcd.springjwt.domain.user.aggregate.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {


}
