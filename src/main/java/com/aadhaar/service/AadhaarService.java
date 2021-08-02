package com.aadhaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadhaar.bean.Aadhaar;
import com.aadhaar.repository.AadhaarRepository;

@Service
public class AadhaarService {
	
	@Autowired
	AadhaarRepository repo;
	
	public Aadhaar viewAadhaar(String aadhaar)
	{
		Aadhaar a = repo.findById(aadhaar).get();
		return a;
	}
	
	public void createAadhaar(Aadhaar aadhaar)
	{
		repo.save(aadhaar);
	}

}
