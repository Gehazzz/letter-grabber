package com.naya.gameofthrones.lettergrabber.services;

import com.naya.gameofthrones.lettergrabber.model.Letter;
import com.naya.gameofthrones.lettergrabber.producer.LetterProducer;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Service
public class LetterDistributorImpl implements LetterDistributor {
    private final LetterProducer producer;
    private final LetterSender sender;
    @Setter
    private int sendDelay=1;

    @SneakyThrows
    @Override
    public void distribute() {
        Letter letter = producer.getLetter();
        Thread.sleep(sendDelay);
        sender.send(letter);
    }
}
