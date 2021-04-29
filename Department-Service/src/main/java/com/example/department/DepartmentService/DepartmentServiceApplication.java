package com.example.department.DepartmentService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(DepartmentServiceApplication.class, args);
		/*ObjectMapper mapper = new ObjectMapper();
		String json = "{\"name\":\"Tharun\", \"firstName\": \"kumar\"}";
		try{
			Map<String ,String> map = mapper.readValue(json, Map.class);
			System.out.println(map);
		}catch (IOException e){
			e.printStackTrace();
		}*/

		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = new HashMap<>();
		map.put("name","Shirisha");
		map.put("firstName","Rao");


		String Json = mapper.writeValueAsString(map);
		System.out.println(Json);

	}
}
