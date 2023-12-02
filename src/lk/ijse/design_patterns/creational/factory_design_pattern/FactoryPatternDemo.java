package lk.ijse.design_patterns.creational.factory_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-1:44 PM
 **/

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        circle.draw();

        Shape square = factory.getShape("Square");
        square.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();
    }
}
