package com.ecommerce.chatbot_ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String gender;
    private String state;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String country;
    private double latitude;
    private double longitude;
    private String trafficSource;
    private LocalDateTime createdAt;
}