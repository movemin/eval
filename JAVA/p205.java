import java.util.Scanner;

public class p205 {
    /** 
     *  주어진 숫자가 회문인지 판별합니다.
     *  @param n: 판별할 정수
     *  @return 회문이면 true, 아니면 false
     */
    public static boolean isPalindrome(int n) {
        // 음수 방어 코드
        if (n < 0) return false;
        // 대상값 보호
        int temp = n;
        // 숫자를 뒤집을 변수 초기화
        int reversed = 0;
        // temp가 0 초과인 동안 반복
        while (temp > 0) {
            // 기존 reversed를 한 자리 올리고, temp의 마지막 자리를 더함
            reversed = reversed * 10 + temp % 10;
            // 대상값 업데이트
            temp /= 10;
        }
        return n == reversed;
    }

    // main 메서드: 구간 내 가장 큰 회문수
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int lower = sc.nextInt();
            int upper = sc.nextInt();

            // 내림차순으로 순회하여 회문이면 리턴으로 반복문 밖의 코드도 읽지 않고 종료
            for (int num = upper; num >= lower; num--) {
                if (isPalindrome(num)) {
                    System.out.println("가장 큰 회문: " + num);
                    return;
                }
            }
            System.out.println("없음");
        }
    }
}