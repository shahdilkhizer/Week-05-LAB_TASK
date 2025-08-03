public class Triangle {
    private double sideA, sideB, sideC;
    private static int objectCount = 0;

    // Default constructor
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        objectCount++;
    }

    // One-parameter constructor
    public Triangle(double x) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
        objectCount++;
    }

    // Two-parameter constructor
    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        objectCount++;
    }

    // Three-parameter constructor
    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        objectCount++;
    }

    // Copy constructor
    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        objectCount++;
    }

    // Getters
    public double getSideA() { 
        return sideA;
     }
    public double getSideB() { 
        return sideB; 
    }
    public double getSideC() {
         return sideC; 
        }

    // Setters with validation
    public void setSideA(double sideA) {
        if (sideA > 0) this.sideA = sideA;
        else showError(sideA);
    }

    public void setSideB(double sideB) {
        if (sideB > 0) this.sideB = sideB;
        else showError(sideB);
    }

    public void setSideC(double sideC) {
        if (sideC > 0) this.sideC = sideC;
        else showError(sideC);
    }

    // Error display
    public static void showError(double vI) {
        System.out.println("Invalid value: " + vI + "\nSide value must be > 0");
    }

    // Object counter
    public static int objectCount() {
        return objectCount;
    }

    // Perimeter
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Valid triangle check
    public boolean isValidTriangle() {
        return (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA);
    }

    // Right-angled triangle check with manual sorting and precision tolerance
    public boolean isRightAngled() {
        double a = sideA, b = sideB, c = sideC;
        // Manual sort: a <= b <= c
        double temp;
        if (a > b) { 
            temp = a;
            a = b; 
            b = temp; 
        }
        if (b > c) { 
            temp = b;
            b = c; 
            c = temp; 
        }
        if (a > b) {
            temp = a;
            a = b; 
            b = temp; 
            }

        
        return ((a * a + b * b) == (c * c));
    }

    // Triangle type
    @Override
    public String toString() {
        String type = (sideA == sideB && sideB == sideC) ? "Equilateral" :
            (sideA == sideB || sideA == sideC || sideB == sideC) ? "Isosceles" : "Scalene";

        return "Triangle with sides: " + sideA + ", " + sideB + ", " + sideC + 
            "\nType: " + type + 
            (isRightAngled() ? " (Right-angled)" : "");
    }
}
