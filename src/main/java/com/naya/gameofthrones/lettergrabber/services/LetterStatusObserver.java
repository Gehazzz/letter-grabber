package com.naya.gameofthrones.lettergrabber.services;


import com.naya.gameofthrones.lettergrabber.model.Notification;

public interface LetterStatusObserver {
    void updateStatus(Notification notification);
}
