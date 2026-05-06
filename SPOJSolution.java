import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  

        while (t-- > 0) {
            int num = sc.nextInt();
            int sum = 0, temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (num % sum == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
