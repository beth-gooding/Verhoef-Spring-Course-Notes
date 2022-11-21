package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1(){
        var parrot = new Parrot();
        parrot.setName("Seb");
        return parrot;
    }

    @Bean
    Parrot parrot2(){
        var parrot = new Parrot();
        parrot.setName("Danny");
        return parrot;
    }

    @Bean
    Parrot parrot3(){
        var parrot = new Parrot();
        parrot.setName("Mick");
        return parrot;
    }
}
