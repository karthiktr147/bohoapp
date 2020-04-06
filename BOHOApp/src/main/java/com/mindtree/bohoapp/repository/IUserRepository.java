package com.mindtree.bohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bohoapp.entity.User;
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
