package com.example.project.service;

import com.example.project.model.GroqRequest;
import com.example.project.model.GroqResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LLMService {

    private final WebClient webClient;

    public LLMService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.groq.com/openai/v1")
                .defaultHeader("Authorization", "Bearer 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") //Groq's Secret API Key
                .build();
    }

    public String askLLM(String userInput) {
        Map<String, String> message = new HashMap<>();
        message.put("role", "user");
        message.put("content", userInput);

        GroqRequest request = new GroqRequest();
        request.setMessages(List.of(message));

        GroqResponse response = webClient.post()
                .uri("/chat/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(GroqResponse.class)
                .block();

        return response.getChoices().get(0).getMessage().getContent();
    }
}
