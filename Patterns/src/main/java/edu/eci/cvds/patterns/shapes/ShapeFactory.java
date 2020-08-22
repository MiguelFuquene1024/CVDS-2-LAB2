package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public ShapeFactory()
    {

    }

    public static Shape create(RegularShapeType type) {
        Shape shape = null;
        switch(type){
            case Triangle:
                shape=new Triangle();
                break;
            case Hexagon:
                shape=new Hexagon();
                break;
            case Quadrilateral:
                shape=new Quadrilateral();
                break;
            case Pentagon:
                shape=new Pentagon();
                break;
            default:
                break;
        }
        return shape;
    }
}
