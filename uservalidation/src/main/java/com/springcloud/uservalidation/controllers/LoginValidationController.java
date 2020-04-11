package com.springcloud.uservalidation.controllers;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/loginValidation")
public class LoginValidationController {
	
	@Autowired
	private Environment env;
	
	@GetMapping(value="/get/info")
	public ResponseEntity<String> getDescription(){
		return(new ResponseEntity<String>("The port Number is :\t"+env.getProperty("local.server.port"),HttpStatus.OK));
	}
	

}
