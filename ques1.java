import java.util.Scanner;

public class ques1 {  
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 integers (a, b, c, d):");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        if ((a + b) > (c + d)) {
            System.out.println("Sum of a and b is greater than sum of c and d.");
        } else {
            System.out.println("Sum of a and b is NOT greater than sum of c and d.");
        }
    }
}
