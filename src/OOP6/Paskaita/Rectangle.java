package OOP6.Paskaita;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void countArea() {
        double area = this.a*this.b;
        this.setArea(area);
    }

    @Override
    public void countPerimeter() {
        double perimeter = this.a*2 + this.b*2;
        this.setPerimeter(perimeter);
    }
}
