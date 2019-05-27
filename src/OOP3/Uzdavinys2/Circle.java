package OOP3.Uzdavinys2;

public class Circle extends Figure {

    public Circle(int radius) {
        super(radius);
    }

    int perimeter() {
        return (int) Math.round(2 * Math.PI * this.radius);
    }

    int area() {
        return (int) Math.round(Math.PI * Math.pow(this.radius, 2));
    }
}
