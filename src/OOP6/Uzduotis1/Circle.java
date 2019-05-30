package OOP6.Uzduotis1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void countArea() {
        double area = Math.PI * this.radius * this.radius;
        setArea(area);
    }

    @Override
    public void countPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        setPerimeter(perimeter);
    }

    @Override
    public double getSideWhenPerimeterIs(double perimeter) {
        return perimeter/(2*Math.PI);
    }

    @Override
    public double getSideWhenAreaIs(double area) {
        return Math.sqrt(area/Math.PI);
    }

    @Override
    public double getAreaWhenPerimeterIs(double perimeter) {
               double radius = this.getSideWhenPerimeterIs(perimeter);
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeterWhenAreaIs(double area) {
        double radius = getSideWhenAreaIs(area);
        return 2 * Math.PI * radius;
    }

    @Override
    public void setAreaWhenPerimeterIs(double perimeter){
        this.setArea(this.getAreaWhenPerimeterIs(perimeter));
    }

    @Override
    public void setPerimeterWhenAreaIs(double area) {
        this.setPerimeter(this.getPerimeterWhenAreaIs(area));
    }
}
