package com.chatbot.WhatsApp.Bot.Simulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;


@SpringBootApplication
public class WhatsAppBotSimulatorApplication {

	public static void main(String[] args) {
		// Set timezone at JVM level
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
		SpringApplication.run(WhatsAppBotSimulatorApplication.class, args);
	}

}
