import java.util.Scanner;

public class Main {

    // 합성수 판별 메서드 (1보다 큰 자연수 중에서 1과 자기 자신 외에 다른 약수를 가진 수)
    private static boolean isCompositeNumber(int number) {
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return true;
                }
        }
        return false;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 합성수의 개수를 구할 정수를 입력받기
            int n = sc.nextInt();
            
            // 합성수의 카운터 초기화
            int count = 0;

            // 소수와 1을 제외한 4부터 n까지 반복하여 cpu 사용량 줄이기
            for (int num = 4; num <= n; num++) {

                // 합성수 판별 메서드를 호출하여 카운트
                if (isCompositeNumber(num)) {
                    count++;
                }
            }
            
            // 최종 카운트 출력
            System.out.println(count);
        }
    }
}