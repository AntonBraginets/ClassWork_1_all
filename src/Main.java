import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
//решение квадратного уравнения
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("\nКорней нет.");
        } else if (D==0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Значение Х1: " + x1);
            System.out.print("Значение Х2: " + x2);
        }
    }
}