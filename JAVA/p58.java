import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // for문으로 배수 시작값에서 n까지 k 스텝만큼 순회하여 해당 배수 나오게 한 후 출력
            for (int number = k; number <= n; number += k) {

                // 해당 배수가 마지막 배수가 아니면 뒤에 공백 붙이기
                if (number != k) {
                    System.out.print(" ");
                }

                // 배수 출력
                System.out.print(number);
            }
        }
    }
}