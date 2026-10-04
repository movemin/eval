import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // break를 만날 때까지 반복
            for (int num = 1; ; num++) {

                // 완전 제곱수가 입력값 보다 높을 때 출력 후 종료
                if (num * num > n) {
                    System.out.println(num * num);
                    break;
                }
            }
        }
    }
}