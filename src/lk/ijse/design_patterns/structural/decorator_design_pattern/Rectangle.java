package lk.ijse.design_patterns.structural.decorator_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-1:59 PM
 **/

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle Draw Method Invoke");
    }
}
