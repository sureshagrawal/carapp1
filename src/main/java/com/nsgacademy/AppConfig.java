package com.nsgacademy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Tyre ty1(){
        return new TubeTyre("Font Left");
    }

    @Bean
    public Tyre ty2(){
        return new TubelessTyre("Front Right");
    }

    @Bean
    public Tyre ty3(){
        return new TubeTyre("Rear Left");
    }

    @Bean
    public Tyre ty4(){
        return new TubelessTyre("Rear Right");
    }
}
