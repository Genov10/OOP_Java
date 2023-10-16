package org.example.control.secondEx;
import java.util.Arrays;
/**
 * Клас, що представляє квадратне рівняння.
 */
public class QuadraticEquation {
    private double a, b, c;
    /**
     * Конструктор класу QuadraticEquation.
     *
     * @param a Коефіцієнт a.
     * @param b Коефіцієнт b.
     * @param c Коефіцієнт c.
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Розв'язує квадратне рівняння та повертає масив розв'язків.
     *
     * @return Масив розв'язків.
     * @throws NoSolutionException Виникає, якщо рівняння не має розв'язків.
     */
    public double[] solve() throws NoSolutionException {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            throw new NoSolutionException("Рівняння не має рішень");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{x1, x2};
        }
    }

    public static void main(String[] args) {
        QuadraticEquation[] equations = new QuadraticEquation[]{
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(1, 2, 3)
        };

        for (QuadraticEquation equation : equations) {
            try {
                double[] solutions = equation.solve();
                System.out.println("Рішення рівняння: " + Arrays.toString(solutions));
            } catch (NoSolutionException e) {
                System.err.println("Рівняння немає рішень");
            }
        }
    }
}
