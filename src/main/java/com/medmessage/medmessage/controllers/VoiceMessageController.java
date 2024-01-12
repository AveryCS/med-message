package com.medmessage.medmessage.controllers;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class VoiceMessageController  {
    @Autowired
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");


    public  void createCall(){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Call call = Call.creator(
                //to
                        new com.twilio.type.PhoneNumber("+12514228131"),
                        //from
                        new com.twilio.type.PhoneNumber("+18336584003"),
                        URI.create("http://demo.twilio.com/docs/voice.xml"))
                .create();

        System.out.println(call.getSid());
    }

    @GetMapping("/testtwilio")
    public void makeCall(){
        System.out.println("--------------------------------"+ ACCOUNT_SID);
        System.out.println("--------------------------------"+ AUTH_TOKEN);
        createCall();


    }

    }

