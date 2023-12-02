package lk.ijse.design_patterns.behavioural.observer_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:45 PM
 **/

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hex String : "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
