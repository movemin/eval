import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    
    // 단일 숫자의 소수 여부를 판별하는 메서드 (단일 책임 원칙)
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int divisor = 2; divisor * divisor <= num; divisor++) {
            if (num % divisor == 0) return false;
        }
        return true;
    }

    // N 이하 소수를 공백 구분 문자열로 반환
    private static String listPrimes(int n) {
        // StringJoiner로 구분자를 자동 관리 → 후행 공백 없음
        StringJoiner sj = new StringJoiner(" ");

        // 2부터 n까지 순회하며 소수이면 추가
        for (int candidate = 2; candidate <= n; candidate++) {
            if (isPrime(candidate)) {
                sj.add(String.valueOf(candidate));
            }
        }

        return sj.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 소수 나열 메서드 출력
        System.out.println(listPrimes(n));
    }
}