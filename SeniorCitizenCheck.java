import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        if (age >= 60)
            System.out.println("Person is a Senior Citizen.");
        else
            System.out.println("Person is NOT a Senior Citizen.");
    }
}
