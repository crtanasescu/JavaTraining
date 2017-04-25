package pJUnitSiExceptii.ex2geometry;

/**
 * Created by Tina on 4/24/2017.
 */
public class GeometricForms {
    String name;

    public GeometricForms(String name) {
        this.name = name;
    }

    public boolean isTriangle() {
        return this.name == Forms.TRIANGLE.name();
    }

    public boolean isCircle() {
        return this.name == Forms.CIRCLE.name();
    }

    public boolean isRectangle() {
        return this.name == Forms.RECTANGLE.name();
    }
}
