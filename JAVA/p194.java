import java.util.Scanner;

public class p194 {

    // 숫자 문자열 유효성 판정 메서드
    private static boolean validNumber(String word) {
        boolean valid = (word.length() > 0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < '0' || word.charAt(i) > '9') {
                valid = false;
                break;
            }
        }
        return valid;
    }

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();
            
            // 숫자 문자열 유효성 판정 메서드 호출
            System.out.println(validNumber(word) ? "숫자": "숫자 아님");
        }
    }
}