import java.util.Scanner;

class Complex {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex() {
    }

    private double x;
    private double y;
    private double i;

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }
    void str() {
        System.out.println("5+3i");
    }
    void add(double x1, double x2, double y1, double y2) {
        x = x1+x2;
        y = y1+y2;
        System.out.printf("Сумма чисел z = (%f, %f)", x, y);
        System.out.println();
    }
    void sub(double x1, double x2, double y1, double y2) {
        x = x1-x2;
        y = y1-y2;
        System.out.printf("Разность чисел z = (%f, %f)", x, y);
        System.out.println();
    }
    void mul(double x1, double x2, double y1, double y2) {
        x = x1*x2-y1*y2;
        y = x1*x2+y1*y2;
        System.out.printf("Произведение чисел z = (%f, %f)", x, y);
        System.out.println();
    }
    void div(double x1, double x2, double y1, double y2, double i) {
        x = (x1*x2+y1*y2)/(Math.pow(x2, 2)+Math.pow(y2, 2));
        y = i*((x2*y1-x1*y2)/(Math.pow(x2, 2)+Math.pow(y2, 2)));
        System.out.print("Разность чисел z = " + x+y);
        System.out.println();
    }
    void module(double x1, double x2, double y1, double y2) {
        double xM1 = Math.abs(x1);
        double xM2 = Math.abs(x2);
        double yM1 = Math.abs(y1);
        double yM2 = Math.abs(y2);
        System.out.printf("Модули чисел z = (%f, %f) и (%f, %f)", xM1, xM2, yM1, yM2);
        System.out.println();
    }
    void compare(double x1, double x2, double y1, double y2) {
        boolean xB = false;
        boolean yB = false;
        boolean zB = false;
        if (x1 == x2)
            xB = true;
        if (y1 == y2)
            yB = true;
        if (xB && yB) {
            zB = true;
        }
        if (zB) {
            System.out.println("Числа равны");
        } else System.out.println("Числа не равны");
    }
}

class Main {
    public static void main(String[] args) {
        Complex complex = new Complex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проверка методов. Введите значения x1, x2, y1, y2, i");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double i = scanner.nextDouble();
        complex.str();
        complex.add(x1, x2, y1, y2);
        complex.sub(x1, x2, y1, y2);
        complex.mul(x1, x2, y1, y2);
        complex.div(x1, x2, y1, y2, i);
        complex.module(x1, x2, y1, y2);
        complex.compare(x1, x2, y1, y2);
    }
}
