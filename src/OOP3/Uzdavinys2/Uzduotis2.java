package OOP3.Uzdavinys2;

public class Uzduotis2 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 3, 4);
        Rectangle rectangle1 = new Rectangle(42, 69);
        Circle circle1 = new Circle(14);

        System.out.printf("Triangle 1 perimeter is: %d\n" +
                "Area is: %d\n", triangle1.perimeter(), triangle1.area());

        System.out.printf("Rectangle 1 perimeter is: %d\n" +
                "Area is: %d\n", rectangle1.perimeter(), rectangle1.area());

        System.out.printf("Circle 1 perimeter is: %d\n" +
                "Area is: %d\n", circle1.perimeter(), circle1.area());
    }
}
