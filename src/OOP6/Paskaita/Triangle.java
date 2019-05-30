package OOP6.Paskaita;

public class Triangle extends Figure {

    protected double a;
    protected double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void countArea() {
        double halfPerimeter = this.getPerimeter() / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
        this.setArea(area);
    }

    @Override
    public void countPerimeter() {
        double perimeter = this.a + this.b + this.c;
        this.setPerimeter(perimeter);
    }
}
