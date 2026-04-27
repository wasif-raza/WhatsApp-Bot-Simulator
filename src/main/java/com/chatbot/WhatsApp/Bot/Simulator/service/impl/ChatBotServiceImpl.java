package com.chatbot.WhatsApp.Bot.Simulator.service.impl;

import com.chatbot.WhatsApp.Bot.Simulator.service.ChatBotService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ChatBotServiceImpl implements ChatBotService {

    @Override
    public String processMessage(String incomingMessage) {

        if (incomingMessage == null) return "Invalid message";
        String msg = incomingMessage.toLowerCase();

        switch (msg) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "I don't understand";
        }

    }
}
