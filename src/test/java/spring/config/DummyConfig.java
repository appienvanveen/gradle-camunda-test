package spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyConfig {

    @Bean
    public Object myBean(){
        return new Object();
    }
}
