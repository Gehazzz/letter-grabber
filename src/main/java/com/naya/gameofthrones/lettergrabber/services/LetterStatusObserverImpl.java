package com.naya.gameofthrones.lettergrabber.services;

import com.naya.gameofthrones.lettergrabber.model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@Service
public class LetterStatusObserverImpl implements LetterStatusObserver{

    private Map<String, Notification> statuses = new HashMap<>();

    @Override
    public void updateStatus(Notification notification) {
        statuses.put(notification.getLetterId(), notification);
        log.info("We got notification about letter with id: " + notification.getLetterId() + " message is " + notification.getMessage());
    }
}
