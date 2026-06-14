import java.util.*;
public class variables{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        float height = sc.nextFloat();
        short year = sc.nextShort();
        double salary = sc.nextDouble();
        char grade = sc.next().charAt(0);
        byte numberofplayers = sc.nextByte();
        boolean isStudent = sc.nextBoolean();

        System.out.println("age" + age);
        System.out.println("height" + height);
        System.out.println("year" + year);
        System.out.println("salary" + salary);
        System.out.println("grade" + grade);
        System.out.println("numberofplayers" + numberofplayers);
        System.out.println("isStudent" + isStudent);

        sc.close();
    }
}
