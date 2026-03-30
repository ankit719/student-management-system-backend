package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sms.entity.person;

@Component
public interface personManager {
	void addPerson(person person);
	void deletePerson(int personId);
	void update(person person,int personId);
	List<person>getPerson();

}
