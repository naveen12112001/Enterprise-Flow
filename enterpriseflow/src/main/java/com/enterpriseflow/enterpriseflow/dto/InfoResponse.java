package com.enterpriseflow.enterpriseflow.dto;


import lombok.Value;

public class InfoResponse {
    String name;
    String version;
    String environment;

    public InfoResponse(String name, String version, String environment) {
        this.name = name;
        this.version = version;
        this.environment = environment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
