package com.naya.gameofthrones.lettergrabber.services;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public interface LetterDistributor {
    void distribute();

    void setSendDelay(int sendDelay);
}
