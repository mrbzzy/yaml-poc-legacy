package com.example.yamlpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YamlPocApplication {
	
	@GetMapping("/yamlpoc") 
	public String yamlpoc(){
		return "yaml-poc successfull via Spring boot demo application";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(YamlPocApplication.class, args);
	}

}
