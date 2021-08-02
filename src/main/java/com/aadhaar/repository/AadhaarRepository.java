package com.aadhaar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aadhaar.bean.Aadhaar;

@Repository
public interface AadhaarRepository extends CrudRepository<Aadhaar, String> {

}
