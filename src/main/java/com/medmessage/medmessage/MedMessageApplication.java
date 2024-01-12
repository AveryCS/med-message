package com.medmessage.medmessage;

import com.medmessage.medmessage.controllers.VoiceMessageController;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import java.net.URI;
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
