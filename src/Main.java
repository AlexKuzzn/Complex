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
    private double z; //Комплексное число

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    String str() {
        return("5+3i");
    }
}