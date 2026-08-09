package com.enterpriseflow.enterpriseflow.dto;

public class WelcomeResponse {

    public String message="Welcome to Enterprise Flow";
    public String application= "Enterprise Flow";

    public WelcomeResponse() {
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
