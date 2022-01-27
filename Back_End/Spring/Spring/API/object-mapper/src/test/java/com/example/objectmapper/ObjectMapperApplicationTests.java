package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-----------");

		var objectMapper = new ObjectMapper();

		//object -> text
		//object mapper 가 get method를 사용해서  변환한다.
		var user = new User("user01", 11);
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		//text -> object
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);

	}


}
