package DesignPattern.ObserverPattern.Observable;

import DesignPattern.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
