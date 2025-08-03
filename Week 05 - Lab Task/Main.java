public class Main {
    public static void main(String[] args) {

        System.out.println("----- Testing Default Constructor -----");
        Triangle t1 = new Triangle();
        System.out.println(t1); // toString
        System.out.println("Valid triangle? " + t1.isValidTriangle());
        System.out.println("Perimeter: " + t1.perimeter());
        System.out.println("Right-angled? " + t1.isRightAngled());

        System.out.println("\n----- Testing One-Parameter Constructor -----");
        Triangle t2 = new Triangle(5);
        System.out.println(t2);
        System.out.println("Valid triangle? " + t2.isValidTriangle());
        System.out.println("Perimeter: " + t2.perimeter());
        System.out.println("Right-angled? " + t2.isRightAngled());

        System.out.println("\n----- Testing Two-Parameter Constructor -----");
        Triangle t3 = new Triangle(4, 6);
        System.out.println(t3);
        System.out.println("Valid triangle? " + t3.isValidTriangle());
        System.out.println("Perimeter: " + t3.perimeter());
        System.out.println("Right-angled? " + t3.isRightAngled());

        System.out.println("\n----- Testing Three-Parameter Constructor -----");
        Triangle t4 = new Triangle(3, 4, 5);  // Right-angled triangle
        System.out.println(t4);
        System.out.println("Valid triangle? " + t4.isValidTriangle());
        System.out.println("Perimeter: " + t4.perimeter());
        System.out.println("Right-angled? " + t4.isRightAngled());
        if (t4.isRightAngled()) {
            System.out.println("This is a right-angled triangle.");
        }

        System.out.println("\n----- Testing Invalid Setters -----");
        t4.setSideA(-2);  // Invalid side
        t4.setSideC(0);   // Invalid side

        System.out.println("\n----- Testing Getters -----");
        System.out.println("Side A: " + t4.getSideA());
        System.out.println("Side B: " + t4.getSideB());
        System.out.println("Side C: " + t4.getSideC());

        System.out.println("\n----- Testing Copy Constructor -----");
        Triangle t5 = new Triangle(t4);
        System.out.println(t5);
        System.out.println("Valid triangle? " + t5.isValidTriangle());
        System.out.println("Perimeter: " + t5.perimeter());
        System.out.println("Right-angled? " + t5.isRightAngled());

        System.out.println("\n----- Total Triangle Objects Created: " + Triangle.objectCount());
    }
}
