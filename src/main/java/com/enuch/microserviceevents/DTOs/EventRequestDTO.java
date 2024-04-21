package com.enuch.microserviceevents.DTOs;

public record EventRequestDTO(int maxParticipants, int registeredParticipants, String date, String title, String description) {
}
