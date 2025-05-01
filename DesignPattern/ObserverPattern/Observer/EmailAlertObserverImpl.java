package DesignPattern.ObserverPattern.Observer;

import DesignPattern.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String email;
    StocksObservable observable;

    public EmailAlertObserverImpl(String email, StocksObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        this.sendMail(email, email);
    }

    private void sendMail(String emailId, String msg) {
        System.err.println("Mail sent to" + emailId + "with body: " + msg);
    }
    
}
