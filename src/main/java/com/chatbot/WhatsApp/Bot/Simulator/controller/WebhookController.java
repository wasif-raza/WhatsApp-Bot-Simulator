package com.chatbot.WhatsApp.Bot.Simulator.controller;

import com.chatbot.WhatsApp.Bot.Simulator.dto.request.UserMessageRequest;
import com.chatbot.WhatsApp.Bot.Simulator.dto.response.BotResponse;
import com.chatbot.WhatsApp.Bot.Simulator.service.ChatBotService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
@AllArgsConstructor
@Slf4j
public class WebhookController {
    public final ChatBotService chatBotService;

    @PostMapping
    public BotResponse receiveMessage(@Valid @RequestBody UserMessageRequest request){

        log.info("Received message from {}: {}", request.getSender(), request.getMessage());

        String reply = chatBotService.processMessage(request.getMessage());

        return new BotResponse(reply);


    }
}
