package com.zyb.cloud.ui.service;

import com.zyb.cloud.ui.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient("person")  //接口中声明方法即可调用Person服务的REST服务 使用feign调用
public interface PersonService {
	 @RequestMapping(method = RequestMethod.POST, value = "/save",
	            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody List<Person> save(@RequestBody String name);
}
