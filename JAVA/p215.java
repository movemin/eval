import java.util.Scanner;

public class p215 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();

            // n번째 5각수를 수학 공식으로 산출
            System.out.println(n * (3 * n - 1) / 2);
        }
    }
}