import java.util.Scanner;

public class Main {

    // 최대공약수 메서드
    private static int gcd(int num1, int num2) {
        for (int divisor = Math.min(num1, num2); divisor >= 2; divisor--) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                return divisor;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            // 최대공약수 구하는 메서드를 호출하여 최소공배수 구하고 출력
            long lcm = (long) num1 * num2 / gcd(num1, num2);
            System.out.println("LCM: " + lcm);
        }
    }
}