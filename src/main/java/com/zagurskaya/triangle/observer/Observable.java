package com.zagurskaya.triangle.observer;

public interface Observable {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
