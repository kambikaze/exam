class Shape {
    void area(double r) {
        System.out.println("Area of circle : " + 3.14 * r * r);
    }
    void area(int l, int b) {
        System.out.println("Area of rectangle : " + l * b);
    }
    void area(double l, double h) {
        System.out.println("Area of triangle : " + 0.5 * l * h);
    }
}
class area {
    public static void main(String args[]) {
        Shape s = new Shape();
        s.area(5.6);
        s.area(2, 4);
        s.area(2.5, 5);
    }
}
