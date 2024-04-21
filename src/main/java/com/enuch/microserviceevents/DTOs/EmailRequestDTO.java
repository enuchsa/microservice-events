package com.enuch.microserviceevents.DTOs;

public record EmailRequestDTO(String to, String subject, String body) {
}
