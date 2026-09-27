import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 서로 다른 소인수 개수 구하기
        int n = sc.nextInt();
        int p = 2;
        int count = 0;

        // 구현문
        while (n > 1) {
            if (n % p == 0) {
                count++;
                while (n % p == 0) {
                    n /= p;
                }
            }
        p++;
        }

        // 서로 다른 소인수 개수 출력
        System.out.println(count);
    }
}