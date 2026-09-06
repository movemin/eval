import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 홀수 누적합, 짝수 누적합 각각 변수 초기화
            int oddSum = 0;
            int evenSum = 0;

            // for문을 활용하여 짝수와 홀수를 나눈 뒤 각 누적합에 합산
            for (int num = 1; num <= n; num++) {
                if (num % 2 != 0) {
                    oddSum += num;
                } else {
                    evenSum += num;
                }
            }
            
            // 각 누적합 출력
            System.out.println("홀수 합: " + oddSum);
            System.out.println("짝수 합: " + evenSum);
        }
    }
}