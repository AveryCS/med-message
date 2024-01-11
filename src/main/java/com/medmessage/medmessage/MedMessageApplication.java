package com.medmessage.medmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedMessageApplication.class, args);
	}
//Sending SMS messages: POST /2010-04-01/Accounts/{TestAccountSid}/Messages
	//task scheduler class
	//pass in phone number and message
}
