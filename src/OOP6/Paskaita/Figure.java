package OOP6.Paskaita;

public abstract class Figure {

    private double area;
    private double perimeter;

    public abstract void countArea();

    public abstract void countPerimeter();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        if (perimeter > 0) {
            this.perimeter = perimeter;
        } else {
            System.out.println("Error: perimeter can't be less then 0");
        }
    }
}
