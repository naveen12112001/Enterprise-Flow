package com.enterpriseflow.enterpriseflow;

import com.enterpriseflow.enterpriseflow.dto.ConfigResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigResponse.class)
public class EnterpriseflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseflowApplication.class, args);
	}

}
