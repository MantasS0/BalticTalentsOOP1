package OOP3.Uzdavinys2;

public class Triangle extends Figure {

    public Triangle(int length1, int length2, int length3) {
        super(length1, length2, length3);
    }

    int perimeter() {
        return this.length1 + this.length2 + this.length3;
    }

    int area() {
        int halfPerimeter = this.perimeter() / 2;
        return (int) Math.round(Math.sqrt(halfPerimeter * (halfPerimeter - this.length1) * (halfPerimeter - this.length2) * (halfPerimeter - this.length3)));
    }

}
