package com.naya.gameofthrones.lettergrabber.controllers;

import com.naya.gameofthrones.lettergrabber.model.Notification;
import com.naya.gameofthrones.lettergrabber.services.LetterDistributor;
import com.naya.gameofthrones.lettergrabber.services.LetterStatusObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class CommunicationController {
    private final LetterDistributor distributor;
    private final LetterStatusObserver observer;

    @GetMapping("/distribution/readDelay/{sendDelay}")
    public void readDelay(@PathVariable("sendDelay") int delay) {
        distributor.setSendDelay(delay);
    }

    @PostMapping("/letter-status")
    public void updateLetterStatus(@RequestBody Notification notification){ observer.updateStatus(notification);}

}
