package lk.ijse.design_patterns.structural.decorator_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:01 PM
 **/

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with no border");
        circle.draw();
        System.out.println("\nCircle with Red Border");
        redCircle.draw();

        Shape rectangle = new Rectangle();
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle with no border");
        rectangle.draw();
        System.out.println("\nRectangle with Red Border");
        redRectangle.draw();

        Shape square = new Square();
        RedShapeDecorator redSquare = new RedShapeDecorator(new Square());
        System.out.println("\nSquare with no border");
        square.draw();
        System.out.println("\nSquare with Red Border");
        redSquare.draw();

    }
}
