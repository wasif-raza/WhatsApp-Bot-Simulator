package com.chatbot.WhatsApp.Bot.Simulator.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserMessageRequest {

    @NotBlank(message = "Sender is required")
    private String sender;

    @NotBlank(message = "Message cannot be empty")
    private String message;
}