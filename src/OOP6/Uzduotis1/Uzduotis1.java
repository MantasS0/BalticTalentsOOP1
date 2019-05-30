package OOP6.Uzduotis1;

/*Sukurkite abstrakčią klasę Figura kurioje būtų aprašyti abstraktūs metodai
plotui ir perimetrui paskaičiuoti
Tada sukurkite dukterines klases Apskritimas, Kvadratas, Trikampis
(lygiakraštis).
1. Paskaičiuokite kokie turėtų būti visų perimetrai, kad plotai būtų vienodi,
tarkime lygūs 100.
2. Paskaičiuokite kokie turėtų būti visų plotai, kad perimetrai būtų vienodi,
tarkime lygūs 100.
Pastaba: apsirašykite Figura klasėje tokius abstrakčius metodus ir po to juos
aprašykite dukterinėse klasėse, kad kaip parametrą pateikus plotą arba
perimetrą, jie paskaičiuotų ir nustatytų atitinkamos figūros kraštinę ar spindulį.*/

import java.text.DecimalFormat;

public class Uzduotis1 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###.##");

        double x = 100;

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);
        System.out.println("For Equilateral Triangle:");
        System.out.println("When perimeter is " + x + ":\n" +
                "Area is: " + df.format(equilateralTriangle.getAreaWhenPerimeterIs(x)));
        System.out.println("When area is " + x + ":\n" +
                "Perimeter is: " + df.format(equilateralTriangle.getPerimeterWhenAreaIs(x)));
        System.out.println();

        Circle circle1 = new Circle(5);

        System.out.println("For Circle:");
        System.out.println("When perimeter is " + x + ":\n" +
                "Area is: " + df.format(circle1.getAreaWhenPerimeterIs(x)));
        System.out.println("When area is " + x + ":\n" +
                "Perimeter is: " + df.format(circle1.getPerimeterWhenAreaIs(x)));
        System.out.println();

        Square square1 = new Square(4);

        System.out.println("For Square:");
        System.out.println("When perimeter is " + x + ":\n" +
                "Area is: " + df.format(square1.getAreaWhenPerimeterIs(x)));
        System.out.println("When area is " + x + ":\n" +
                "Perimeter is: " + df.format(square1.getPerimeterWhenAreaIs(x)));
        System.out.println();



    }
}
