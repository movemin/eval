import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            int sum = 0;

            // k의 배수이므로 k부터 k의 3배수까지 반복하고 k 스텝으로 설정
            for (int multiple = k; multiple <= k * 3; multiple += k) {
                sum += multiple;
            }

            // 합계 출력
            System.out.println(sum);
        }
    }
}