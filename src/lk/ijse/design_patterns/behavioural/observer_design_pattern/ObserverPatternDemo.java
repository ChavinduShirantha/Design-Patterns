package lk.ijse.design_patterns.behavioural.observer_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:46 PM
 **/

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First State change : 15");
        subject.setState(15);
        System.out.println("Second State Change : 10");
        subject.setState(10);
    }
}
