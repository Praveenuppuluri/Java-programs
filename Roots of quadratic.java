import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter coefficients (a, b, c) of quadratic equation:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double d = b*b - 4*a*c; // Discriminant
        
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println(r1 + " and " + r2 + " are real and distinct roots");
        } else if (d == 0) {
            double r = -b / (2*a);
            System.out.println(r + " and " + r + " are real and equal roots");
        } else {
             System.out.println("Roots are Complex");
	  }
     }
}
