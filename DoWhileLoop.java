import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Enter 1 to continue and 0 to stop: ");
            int num = scan.nextInt();
            if (num != 1 && num != 0) {
                System.out.println("Invalid input, please enter 1 or 0");
                continue;
            }
            if (num == 0) {
                break;
            }
            System.out.print("Enter student marks: ");
            int marks = scan.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks is invalid");
            }else if (marks >= 90) {
                System.out.println("This is good");
            }else if (marks >= 60) {
                System.out.println("This is also good");
            }else {
                System.out.println("This is good as well");
            }
        } while (true);;
        scan.close();
    }
}