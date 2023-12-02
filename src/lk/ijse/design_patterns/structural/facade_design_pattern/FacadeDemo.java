package lk.ijse.design_patterns.structural.facade_design_pattern;

/**
 * @author : Chavindu
 * created : 12/2/2023-1:50 PM
 **/

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
