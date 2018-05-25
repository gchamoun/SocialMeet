package com.example.gcham.socialmeet;

public class cards {
    private String userId;
    private String name;
    public cards (String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
