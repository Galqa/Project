/* Cтворіть проект із пакетом. Потрібно: Створити клас із ім'ям Rectangle.
У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2) і периметр прямокутника - double perimeterCalculator (double side1, double side2).
Написати програму, яка приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр та площу.
 */

package project1;

import java.util.Scanner;

public class Rectangle {
  private double side1;
  private double side2;
    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public double areaCalculator() {
        return side1 * side2;
    }
    public double perimeterCalculator() {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину першої сторони прямокутника:");
        double side1 = scanner.nextDouble();
        System.out.println("Введіть довжину другої сторони прямокутника:");
        double side2 = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);
        System.out.println("Площа прямокутника: " + rectangle.areaCalculator());
        System.out.println("Периметр прямокутника: " + rectangle.perimeterCalculator());
    }
}
