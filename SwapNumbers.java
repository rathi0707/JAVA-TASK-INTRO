import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = sc.nextInt(), y = sc.nextInt();

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}
