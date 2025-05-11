package com.example.testly_be;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.lang.NonNull;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Value("${frontend.url}")
    private String frontendUrl;
    
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/**") 
                .allowedOrigins(frontendUrl) 
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") 
                .allowedHeaders("*") 
                .allowCredentials(true) 
                .maxAge(3600); 
    }

}
