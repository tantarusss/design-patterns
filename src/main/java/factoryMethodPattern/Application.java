package factoryMethodPattern;

import factoryMethodPattern.factory.CircleShapeFactory;
import factoryMethodPattern.factory.ShapeFactory;
import factoryMethodPattern.factory.SquareShapeFactory;
import factoryMethodPattern.shape.Circle;
import factoryMethodPattern.shape.Shape;
import factoryMethodPattern.shape.Square;

public class Application {
    static ShapeFactory shapeFactory;
    public static void initialize() throws Exception {
        String desiredShape = "Circle";
        if (desiredShape.equals("Circle")) {
            shapeFactory = new CircleShapeFactory();
        } else if (desiredShape.equals("Square")) {
            shapeFactory = new SquareShapeFactory();
        } else {
            throw new Exception("Error! Unknown Shape");
        }
    }

    public void main(String[] args) throws Exception {
        initialize();
        shapeFactory.createShape();
    }

}
