package com.ajudacerteira.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String eventImageUrl;
    private String eventDay; 


    @Column(columnDefinition = "TEXT")
    private String description;

    private String creatorName;
    private String creatorImageUrl;

    public Evento() {
    }

    public Evento(Long id, String name, String address, String eventImageUrl, String eventDay, String description,
            String creatorName, String creatorImageUrl) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.eventImageUrl = eventImageUrl;
        this.eventDay = eventDay;
        this.description = description;
        this.creatorName = creatorName;
        this.creatorImageUrl = creatorImageUrl;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEventImageUrl() {
        return eventImageUrl;
    }
    public void setEventImageUrl(String eventImageUrl) {
        this.eventImageUrl = eventImageUrl;
    }
    public String getEventDay() {
        return eventDay;
    }
    public void setEventDay(String eventDay) {
        this.eventDay = eventDay;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCreatorName() {
        return creatorName;
    }
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
    public String getCreatorImageUrl() {
        return creatorImageUrl;
    }
    public void setCreatorImageUrl(String creatorImageUrl) {
        this.creatorImageUrl = creatorImageUrl;
    }

    

}
