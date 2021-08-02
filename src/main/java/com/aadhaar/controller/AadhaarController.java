package com.aadhaar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aadhaar.bean.Aadhaar;
import com.aadhaar.service.AadhaarService;

@RestController
public class AadhaarController {
	@Autowired
	AadhaarService service;
	
	@GetMapping("/viewaadhaar/{aadhaar}")
	public Aadhaar viewAadhaar(@PathVariable String aadhaar) {
		Aadhaar a = service.viewAadhaar(aadhaar);
		return a;
	}

	@PostMapping("/createaadhaar")
	public void createAadhaar(@RequestBody Aadhaar aadhaar) {
		service.createAadhaar(aadhaar);
	}

}
