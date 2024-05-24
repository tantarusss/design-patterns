package factoryMethodPattern.factory;

import factoryMethodPattern.shape.Circle;
import factoryMethodPattern.shape.Shape;

public class CircleShapeFactory extends ShapeFactory{
    public Shape createShape() {
        return new Circle();
    }
}
