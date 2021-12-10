package hu.kisallatokSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    private RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}