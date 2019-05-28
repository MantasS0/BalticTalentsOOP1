package OOP4.Paskaita;

public class Circle extends Figure {

    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.area();
    }

    double perimeter() {
        return 2 * this.pi * this.radius;
    }

    double area() {
        this.area = this.pi * this.radius * this.radius;
        return this.area;
    }
}
