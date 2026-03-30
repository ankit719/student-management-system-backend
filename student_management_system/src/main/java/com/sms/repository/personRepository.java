package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.entity.person;

@Repository
public interface personRepository extends JpaRepository<person,Integer> {

}
