package lk.ijse.design_patterns.creational.factory_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-1:43 PM
 **/

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else {
            if (shapeType.equals("Circle")) {
                return new Circle();
            } else if (shapeType.equals("Square")) {
                return new Square();
            } else if (shapeType.equals("Rectangle")) {
                return new Rectangle();
            }
        }
        return null;
    }
}
