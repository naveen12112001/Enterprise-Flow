package com.enterpriseflow.enterpriseflow.dto;

import java.time.Instant;

public class TimeResponse {
    Instant timestamp;
    public TimeResponse(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
