package DesignPattern.ObserverPattern;

import DesignPattern.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPattern.ObserverPattern.Observable.StocksObservable;
import DesignPattern.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPattern.ObserverPattern.Observer.MobileAlertObserverImpl;
import DesignPattern.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@abc.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("pqr@pqr.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_user", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}
