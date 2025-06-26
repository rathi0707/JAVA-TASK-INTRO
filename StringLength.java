import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String msg = sc.nextLine();

        System.out.println("Length of string: " + msg.length());
    }
}
