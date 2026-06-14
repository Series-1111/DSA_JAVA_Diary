import java.util.Scanner;
public class ifelse{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for modulus");
        int choice = sc.nextInt();
        if (choice ==1) {
            System.out.println("addition is" + (a+b));
        }else if(choice == 2) {
            System.out.println("Subtraction is" + (a-b));
        }else if(choice == 3) {
            System.out.println("Multiplication is" + (a*b));
        }else if(choice == 4) {
            System.out.println("Division is" + (a/b));
        }else if(choice == 5) {
            System.out.println("Modulus is" + (a%b));
        }else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}



