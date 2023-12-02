package lk.ijse.design_patterns.structural.decorator_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:00 PM
 **/

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    public void draw(){
        decoratorShape.draw();
    }
}
