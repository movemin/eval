import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    // 소인수분해 나열을 메서드로 모듈화하여 가독성 향상
    private static String primeFactorization(int num) {

        // 끝의 값을 공백없이 처리하기 위해 모듈 불러오기
        StringJoiner sj = new StringJoiner(" ");
        int p = 2;
        while (num > 1) {
            while (num % p == 0) {
                sj.add(String.valueOf(p));
                num /= p; 
            }
            p++;
        }
        return sj.toString();
    }

    // 소인수분해할 정수를 입력받아 메서드를 호출하여 출력
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(primeFactorization(n));
        }
    }
}