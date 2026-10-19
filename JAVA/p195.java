import java.util.Scanner;

public class p195 {

    // 숫자 문자열의 자릿수 합을 구하는 메서드
    private static int stringDigitsSum(String word) {
        int sum = 0;

        for (int idx = 0; idx < word.length(); idx++) {
            sum += (word.charAt(idx) - '0');
        }

        return sum;
    }

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();

            // 메서드 호출
            System.out.println(stringDigitsSum(word));
        }
    }
}