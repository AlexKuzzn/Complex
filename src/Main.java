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
    String str() {
        return("5+3i");
    }
    void add(double x1, double x2, double y1, double y2) {
        x = x1+x2;
        y = y1+y2;
        System.out.printf("Сумма чисел z = (%f, %f)", x, y);
    }
    void sub(double x1, double x2, double y1, double y2) {
        x = x1-x2;
        y = y1-y2;
        System.out.printf("Разность чисел z = (%f, %f)", x, y);
    }
    void mul(double x1, double x2, double y1, double y2) {
        x = x1*x2-y1*y2;
        y = x1*x2+y1*y2;
        System.out.printf("Произведение чисел z = (%f, %f)", x, y);
    }
    void div(double x1, double x2, double y1, double y2, double i) {
        x = (x1*x2+y1*y2)/(Math.pow(x2, 2)+Math.pow(y2, 2));
        y = i*((x2*y1-x1*y2)/(Math.pow(x2, 2)+Math.pow(y2, 2)));
        System.out.print("Разность чисел z = " + x+y);
    }
}
