package OOP6.Uzduotis1;

public class Triangle extends Figure {

    private double a;
    private double b;
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

    @Override
    public double getSideWhenPerimeterIs(double perimeter) {
        return 0;
    }

    @Override
    public double getSideWhenAreaIs(double area) {
        return 0;
    }

    @Override
    public double getAreaWhenPerimeterIs(double perimeter) {
        return 0;
    }

    @Override
    public double getPerimeterWhenAreaIs(double area) {
        return 0;
    }

    @Override
    public void setAreaWhenPerimeterIs(double perimeter) {

    }

    @Override
    public void setPerimeterWhenAreaIs(double area) {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
