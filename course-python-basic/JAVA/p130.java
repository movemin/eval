import java.util.Scanner;

public class Main {
    private static boolean isPrime(int num) {

        // 2 미만 숫자가 들어올 경우 무조건 false 리턴
        if (num < 2) return false;

        // 2부터 심사할 정수까지 순회하여 소수 판별
        for (int digit = 2; digit * digit <= num; digit++){
            if (num % digit == 0) {
                return false;
            }
        }

        // 소수라면 true 리턴
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 카운트 변수와 심사할 정수 2부터 저장
            int count = 0;
            int candidate = 2;
            
            // 카운트가 입력값이 일치하는 break를 만날 때까지 반복
            while (true) {

                // 소수일 경우 카운트
                if (isPrime(candidate)) {
                    count++;
                }

                // 카운트와 입력값이 일치할 시 해당 심사 정수를 출력한 뒤 종료
                if (count == n) {
                    System.out.println(candidate);
                    break;
                }

                // 아직 일치하지 않는다면 심사정수 업데이트
                candidate++;
            }
        }
    }
}