package com.naya.gameofthrones.lettergrabber;

import com.naya.gameofthrones.lettergrabber.services.LetterDistributor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LetterGrabberApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LetterGrabberApplication.class, args);
        LetterDistributor distributor = context.getBean(LetterDistributor.class);
        while (true) {
            distributor.distribute();
        }
    }

}

