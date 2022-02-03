package com.edu.university.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Data
public class DbConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("mysql")
    @Bean
    public String MySQLConnection() {
        System.out.println("MYSQL Database");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Connection to MySql";
    }
}
