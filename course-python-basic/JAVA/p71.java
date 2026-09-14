import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // 10을 k 제곱을 하여 각 원하는 자리수로 환산해줄 나누는 수 구하기
            int power = (int) Math.pow(10, k);

            // 나눠서 나머지 연산
            int result = n % power;
            
            // 최종 결과값 출력
            System.out.printf("뒤 %d자리: %d", k, result);
        }
    }
}