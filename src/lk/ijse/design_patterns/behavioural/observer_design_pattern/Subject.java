package lk.ijse.design_patterns.behavioural.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:46 PM
 **/

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observers){
            observer.update();
        }
    }
}
