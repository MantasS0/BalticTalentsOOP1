package OOP3.Uzdavinys2;

public class Rectangle extends Figure {

    public Rectangle(int length1, int length2) {
        super(length1, length2);
    }

    int perimeter() {
        return (this.length1 + this.length2) * 2;
    }

    int area() {
        return this.length1 * this.length2;
    }

}
