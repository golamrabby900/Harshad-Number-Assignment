import java.util.Scanner;

public class HarshadNumber {

    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isHarshad(num))
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");

        sc.close();
    }
}
