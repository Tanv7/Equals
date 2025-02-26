package Tanya;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    public void zoomCircle(double r) {
        this.r = this.r * r;
    }
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }
    // метод вычисляющий площадь круга
    public double squareCircle() {
        double s = Math.PI * r * r;
        return s;
    }
    // метод проверяющий равны ли окружности по площадям
    public boolean equalsCircle(Circle cir) {
        if(this.squareCircle() == cir.squareCircle()) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Circle o1 = new Circle();
        o1.printCircle(); // Окружность с центром (0.0;0.0) и радиусом 1.0
        Circle o2 = new Circle(1,-1,14);
        o2.printCircle(); // Окружность с центром (1.0;-1.0) и радиусом 14.0
        System.out.println("Площадь круга o2: "+o2.squareCircle()); //615.75...
        o1.zoomCircle(14);
        if(o1.equalsCircle(o2)) {
            System.out.println("Круги o2 и o1 имеют равную площадь");
        } else {
            System.out.println("Круги o2 и o1 имеют различную площадь");
        }
    }
}