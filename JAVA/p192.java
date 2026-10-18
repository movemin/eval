import java.util.Scanner;

public class p192 {

    // 문자열 뒤집기 메서드 설계
    /**
     * @param word 뒤집을 문자열
     * @return 뒤집힌 문자열
     * @throws IllegalArgumentException word가 null인 경우 (외부 호출 대비)
     */
    private static String reverseWord(String word) {

        // null 방어 처리 — sc.next()는 null을 반환하지 않지만, 메서드 재사용 시 대비
        if (word == null || word.isEmpty()) return "";
        String result = "";

        // 문자열 길이 내림차순으로 해당 인덱스로 문자열 재정렬
        for (int idx = word.length() - 1; idx >= 0; idx--) {
            result += word.charAt(idx);
        }

        // 문자열 뒤집은 결과 반환
        return result;
    }

    // main 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();

            // 메서드 호출
            System.out.println(reverseWord(word));
        }
    }
}