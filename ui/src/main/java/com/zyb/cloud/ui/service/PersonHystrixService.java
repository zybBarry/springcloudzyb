package com.zyb.cloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zyb.cloud.ui.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonHystrixService {

	@Autowired
	PersonService personService; 

	@HystrixCommand(fallbackMethod = "fallbackSave") //方法调用失败时调用失败时，调用后备方法
	public List<Person> save(String name) {
		return personService.save(name);
	}
	
	public List<Person> fallbackSave(String name){ 
		List<Person> list = new ArrayList<>();
		Person p = new Person(name+"没有保存成功，Person Service 故障");
		list.add(p);
		return list;
	}
}
