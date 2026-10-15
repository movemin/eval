import java.util.Scanner;

public class p191 {

    /**
     * 회문 판정 메서드
     * @param word 판정할 문자열
     * @return 회문이면 true, 아니면 false
     */
    private static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        boolean palin = true;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                palin = false;
                break;
            }
            i++;
            j--;
        }
        return palin;
    }

    // 메인 스크립트
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 문자열 단어 입력받기
            String word = sc.next();

            // 삼항연산자를 통해 함수를 호출시켜 회문 판정 문자열 출력
            System.out.println(isPalindrome(word) ? "회문" : "회문 아님");
        }
    }
}