package com.ja1zinh0.agendaTelefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AgendaTelefonicaApplication {
	public static void main(String[] args) {
		SpringApplication.run(AgendaTelefonicaApplication.class, args);
	}

}


