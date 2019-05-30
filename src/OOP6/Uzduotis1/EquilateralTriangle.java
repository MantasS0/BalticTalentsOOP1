package OOP6.Uzduotis1;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    @Override
    public void countArea() {
        double area = (Math.sqrt(3) / 4) * (this.getA() * this.getA());
        this.setArea(area);
    }

    @Override
    public double getSideWhenPerimeterIs(double perimeter) {
        return perimeter / 3;
    }

    @Override
    public double getSideWhenAreaIs(double area) {
        return (2 / 3d) * Math.pow(3, (3 / 4d)) * Math.sqrt(area);
    }

    @Override
    public double getAreaWhenPerimeterIs(double perimeter) {
        double a = getSideWhenPerimeterIs(perimeter);
        return (Math.sqrt(3) / 4) * (a * a);
    }

    @Override
    public double getPerimeterWhenAreaIs(double area) {
        double a = getSideWhenAreaIs(area);
        return a * 3;
    }

    @Override
    public void setAreaWhenPerimeterIs(double perimeter) {
        this.setArea(this.getAreaWhenPerimeterIs(perimeter));
    }

    @Override
    public void setPerimeterWhenAreaIs(double area) {
        this.setPerimeter(this.getPerimeterWhenAreaIs(area));
    }


}
