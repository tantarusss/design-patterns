package factoryMethodPattern.factory;

import factoryMethodPattern.shape.Shape;
import factoryMethodPattern.shape.Square;

public class SquareShapeFactory extends ShapeFactory {
    public Shape createShape() {
        return new Square();
    }
}
