package lk.ijse.design_patterns.behavioural.observer_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:46 PM
 **/

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal String : "+Integer.toOctalString(subject.getState()));
    }
}
