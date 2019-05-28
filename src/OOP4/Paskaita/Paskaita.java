package OOP4.Paskaita;


public class Paskaita {
    public static void main(String[] args) {

        Circle[] circles = new Circle[5];

        Circle temp;

        for (int i = 1; i <= 5; i++) {
            circles[i - 1] = new Circle(i);
            System.out.println("Apskritimas " + i + " plotas: " + circles[i - 1].area());
        }

        for (int i = 0; i < circles.length; i++) {
            for (int j = 0; j < circles.length; j++) {
                if (circles[i].area > circles[j].area) {
                    temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }

        for (int i = 0; i < circles.length; i++) {
            System.out.println("Apskritimas " + i + " plotas: " + circles[i].area());
        }


    }
}
