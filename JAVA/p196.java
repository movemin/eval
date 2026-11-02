import java.util.Scanner;

public class p196 {

    // 로마 숫자를 10진수로 바꾸는 메서드
    private static int romanCharToValue(char c) {
        int result = 0;
        if (c == 'I') {
            result = 1;
        } else if (c == 'V') {
            result = 5;
        } else if (c == 'X') {
            result = 10;
        } else if (c == 'L') {
            result = 50;
        } else if (c == 'C') {
            result = 100;
        } else if (c == 'D') {
            result = 500;
        } else if (c == 'M') {
            result = 1000;
        }
        return result;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();
            int result = 0;
            for (int idx = 0; idx < word.length(); idx++) {
                int cur = romanCharToValue(word.charAt(idx));
                
                int next = (idx + 1 < word.length()) ? romanCharToValue(word.charAt(idx + 1)) : 0;
                if (cur < next) result -= cur; else result += cur;
            }

            System.out.println(result);
        }
    }
}