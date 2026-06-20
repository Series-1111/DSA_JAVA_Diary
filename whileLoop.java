import java.util.Scanner;
public class whileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Table of " + n);
        int i = 1;
        while(i < 11) {
            System.out.println(n + "*" + i + "=" + (n*i));
            i++;
        }
        sc.close();
    }
}
