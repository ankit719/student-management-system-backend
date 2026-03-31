package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.person;
import com.sms.service.personManager;

@RestController
@CrossOrigin("*")
public class personController {
    @Autowired
    personManager personMan;
    
    @PostMapping("api/add/person")
	 public void addPerson(@RequestBody person person)
	 {
    	personMan.addPerson(person);
	 }
    
    @PostMapping("api/delete/person")
  	 public void deletePerson(@RequestBody person person)
  	 {
      	personMan.deletePerson(person.personId);
  	 }
}
