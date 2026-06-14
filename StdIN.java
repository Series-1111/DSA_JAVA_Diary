import java.util.Scanner;

public class StdIN {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int diameter = sc.nextInt();
        float radius = diameter/2.0f;
        System.out.println("radius " + radius);
        double area = 3.14 * radius* radius;
        System.out.println("area " + area);
        sc.close(); 
    }
}
