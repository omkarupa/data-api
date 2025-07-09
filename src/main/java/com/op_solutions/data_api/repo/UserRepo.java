package com.op_solutions.data_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.op_solutions.data_api.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
