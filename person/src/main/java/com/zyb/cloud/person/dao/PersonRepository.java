package com.zyb.cloud.person.dao;


import com.zyb.cloud.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
