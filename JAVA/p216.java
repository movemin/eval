import java.util.Scanner;

public class p216 {
    public static boolean isPalindrome(long n) {
        // 음수 방어 코드
        if (n < 0) return false;
        // 문자열 변환 방식으로 간결하게 표현 (숫자 뒤집기 로직과 동일한 결과)
        String s = Long.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // 메인코드
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long candidate = 0;
            long palindromeCount = 0;
            while (palindromeCount < n) {
                candidate++;
                if (isPalindrome(candidate)) {
                    palindromeCount++;
                }
            }
            System.out.println(candidate);
        }
    }
}