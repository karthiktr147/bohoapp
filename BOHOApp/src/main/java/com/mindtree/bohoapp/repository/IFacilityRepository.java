package com.mindtree.bohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.mindtree.bohoapp.entity.Facility;
@Repository
public interface IFacilityRepository extends JpaRepository<Facility, Long>{

}
