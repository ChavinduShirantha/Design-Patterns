package lk.ijse.design_patterns.behavioural.observer_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:45 PM
 **/

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : "+Integer.toBinaryString(subject.getState()));
    }
}
