import java.util.Scanner;

public class p193 {

    // 특정 문자 카운터 메서드
    private static int charCount(String word, char c) {

        // 카운트
        int count = 0;

        // 해당 문자열 오름차순으로 반복하여 인덱스 구현
        for (int idx = 0; idx < word.length(); idx++) {

            // 해당 문자가 매개변수 특정 문자와 같다면 카운트
            if (word.charAt(idx) == c) count++;
        }

        // 최종 카운트 반환
        return count;
    }

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();
            char c = sc.next().charAt(0);

            // 문자열 안에서 특정 문자 등장 횟수 출력
            System.out.println(charCount(word, c));
        }
    }
}