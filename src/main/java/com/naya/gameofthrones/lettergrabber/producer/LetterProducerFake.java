package com.naya.gameofthrones.lettergrabber.producer;

import com.github.javafaker.GameOfThrones;
import com.naya.gameofthrones.lettergrabber.model.Letter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class LetterProducerFake implements LetterProducer {
    private final GameOfThrones faker;

    @Setter
    private int delay=2000;

    @Override
    @SneakyThrows
    public Letter getLetter() {
        Thread.sleep(delay);
        return randomLetter();
    }

    private Letter randomLetter(){
        return Letter.builder().id(UUID.randomUUID().toString()).content(faker.quote()).location(faker.city()).signature(faker.character()).build();
    }







}
