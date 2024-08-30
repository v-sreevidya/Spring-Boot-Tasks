package com.example.task2.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class OrderConfig {

//    @Bean
//    public AuditorAware<String> auditorProvider() {
//        // Placeholder implementation; replace with actual logic to provide current user or context
//        return () -> Optional.ofNullable("orders"); // Replace with actual user or context if needed
//    }
}
