package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.person;
import com.sms.repository.personRepository;

@Service
public class personManangerImp implements personManager {

	@Autowired
	personRepository personRepo;
	
	@Override
	public void addPerson(person person) {
		// TODO Auto-generated method stub
		personRepo.save(person);
		
	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		personRepo.deleteById(personId);
		
	}

	@Override
	public void update(person person, int personId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<person> getPerson() {
		// TODO Auto-generated method stub
		return personRepo.findAll();

	}

}
