package com.example.javaEmailSender4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaEmailSender4Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaEmailSender4Application.class, args);
	}


	@Autowired
	private EmailSenderService senderService;


	@EventListener(ApplicationReadyEvent.class)
	public void getEmail(){

		senderService.setEmail("wogiwi9217@hrisland.com",
				"This The Fucking object",
				"My Dear Friend:\n" + "I Am Send You THis From Mars OK!!" + "And THIS oNe is " +
						"the updated one");


	}



}
