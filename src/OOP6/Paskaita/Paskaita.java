package OOP6.Paskaita;

public class Paskaita {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(4,5,7);
        RightAngledTriangle triangle2 = new RightAngledTriangle(3,4);
        triangle1.countArea();
        triangle2.countArea();
        triangle1.countPerimeter();
        triangle2.countPerimeter();


    }
}
