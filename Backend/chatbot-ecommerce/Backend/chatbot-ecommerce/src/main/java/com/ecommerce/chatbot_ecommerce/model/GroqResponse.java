package com.example.project.model;

import java.util.List;

public class GroqResponse {
    private List<Choice> choices;

    // Getter and Setter for choices
    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public static class Choice {
        private Message message;

        // Getter and Setter for message
        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    public static class Message {
        private String role;
        private String content;

        // Getter and Setter for ro
