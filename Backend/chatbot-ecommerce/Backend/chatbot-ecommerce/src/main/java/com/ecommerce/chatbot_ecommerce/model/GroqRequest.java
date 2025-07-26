package com.example.project.model;

import java.util.List;
import java.util.Map;

public class GroqRequest {
    private String model = "llama3-70b-8192";
    private List<Map<String, String>> messages;

    // Constructor
    public GroqRequest() {}

    public GroqRequest(String model, List<Map<String, String>> messages) {
        this.model = model;
        this.messages = messages;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for messages
    public List<Map<String, String>> getMessages() {
        return messages;
    }

    // Setter for messages
    public void setMessages(List<Map<String, String>> messages) {
        this.messages = messages;
    }
}
