package lk.ijse.design_patterns.structural.decorator_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-2:00 PM
 **/

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    public void setRedBorder(Shape decoratorShape){
        System.out.println("Border Color : Red");
    }
}
