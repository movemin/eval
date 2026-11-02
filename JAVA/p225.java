import java.util.Scanner;

public class p225 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            long lo = (d == 1) ? 1 : (long) Math.pow(10, d - 1);
            long hi = (long) Math.pow(10, d) - 1;
            for (long k = lo; k <= hi; k++) {
                if (Utils.isPalindrome(k) && Utils.isPrime(k)) {
                    System.out.println(k);
                    return;
                }
            }
            System.out.println("없음");
        }
    }
}

class Utils {

    public static boolean isPalindrome(long n) {
        // 음수 방어 코드
        if (n < 0) return false;
        // 문자열 변환 방식으로 간결하게 표현 (숫자 뒤집기 로직과 동일한 결과)
        String s = Long.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    
    public static boolean isPrime(long num) {

        // 2 미만 숫자가 들어올 경우 무조건 false 리턴
        if (num < 2) return false;

        // 2부터 심사할 정수까지 순회하여 소수 판별
        for (long divisor = 2; divisor * divisor <= num; divisor++){
            if (num % divisor == 0) {
                return false;
            }
        }

        // 소수라면 true 리턴
        return true;
    }
}