package lk.ijse.design_patterns.creational.singleton_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-1:28 PM
 **/

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();

        instance.showMessage();
    }
}
