package lk.ijse.design_patterns.creational.singleton_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-1:29 PM
 **/

public class SingletonObject {
    private static SingletonObject instance=new SingletonObject();

    private SingletonObject(){

    }

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("This is Example Method");
    }
}
