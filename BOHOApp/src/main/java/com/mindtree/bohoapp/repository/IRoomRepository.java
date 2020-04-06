package com.mindtree.bohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bohoapp.entity.Room;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Long>{

}
