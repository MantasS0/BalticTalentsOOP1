package OOP6.Paskaita;

public class RightAngledTriangle extends Triangle {

    public RightAngledTriangle(double a, double b) {
        super(a,b,RightAngledTriangle.countCLength(a,b));
    }

    @Override
    public void countArea(){
        double area = 0.5 * this.a * this.b;
        this.setArea(area);
    }

    private static double countCLength(double a, double b) {
        double c;
        c = Math.sqrt(a * a + b * b);
        return c;
    }


}
