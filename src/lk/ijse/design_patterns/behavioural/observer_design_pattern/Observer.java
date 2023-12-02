package lk.ijse.design_patterns.behavioural.observer_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:45 PM
 **/

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
