package com.example.mystarterpacktwo;

public class Review {

    String id,description;


    public Review() {
    }

    public Review(String id, String description) {
        this.id = id;

        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
