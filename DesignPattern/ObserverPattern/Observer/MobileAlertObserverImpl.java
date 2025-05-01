package DesignPattern.ObserverPattern.Observer;

import DesignPattern.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable) {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        this.sendMsgOnMobile(username, "product in stock. Hurry up!!");
    }

    private void sendMsgOnMobile(String username, String msg) {
        System.out.println("msg sent to: " + username);
    }
    
}
