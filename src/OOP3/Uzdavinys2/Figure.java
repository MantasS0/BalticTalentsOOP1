package OOP3.Uzdavinys2;

public class Figure {
    int length1;
    int length2;
    int length3;
    int radius;

    public Figure(int length1, int length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    public Figure(int length1, int length2, int length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public Figure(int radius) {
        this.radius = radius;
    }

}
