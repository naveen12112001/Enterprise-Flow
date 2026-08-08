package com.enterpriseflow.enterpriseflow.dto;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ConfigurationProperties(prefix="config.application")
public class ConfigResponse {
    String name;
    String environment;
    int serverPort;
}
