package com.chatbot.WhatsApp.Bot.Simulator.service;

import com.chatbot.WhatsApp.Bot.Simulator.dto.response.BotResponse;

public interface ChatBotService {

    public String processMessage( String incomingMessage);
}
