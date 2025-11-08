package com.example.first;

import java.lang.annotation.Inherited;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String contactNumber;
    private String gender;
    private int rating;
    private String description;

    // getters and setters for all the data 
    public Long getId() { // getter for id
        return id;
    }

    public String getName() { // getter for name
        return name;
    }

    public void setName(String name) { // setter for name
        this.name = name;
    }

    public String getEmail() { // getter for email
        return email;
    }

    public void setEmail(String email) { // setter for email
        this.email = email;
    }

    public String getContactNumber() { // getter for contactNumber
        return contactNumber;
    }

    public void setContactNumber(String contactNUmber) { // setter for contactNumber
        this.contactNumber = contactNumber;
    }

    public String getGender() { // getter for gender
        return gender;
    }

    public void setGender(String gender) { // setter for gendere
        this.gender = gender;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) { // setter for rating
        this.rating = rating;
    }

    public String getDescription() { // getter for description
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}