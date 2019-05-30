package OOP6.Uzduotis1;

public class Square extends Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void countArea() {
        double area = this.a*this.a;
        this.setArea(area);
    }

    @Override
    public void countPerimeter() {
        double perimeter = this.a*4;
        this.setPerimeter(perimeter);
    }

    @Override
    public double getSideWhenPerimeterIs(double perimeter) {
        return perimeter/4;
    }

    @Override
    public double getSideWhenAreaIs(double area) {
        return Math.sqrt(area);
    }

    @Override
    public double getAreaWhenPerimeterIs(double perimeter) {
        double a = getSideWhenPerimeterIs(perimeter);
        return a*a;
    }

    @Override
    public double getPerimeterWhenAreaIs(double area) {
        double a = getSideWhenAreaIs(area);
        return a*4;
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
