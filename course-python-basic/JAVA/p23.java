public class Main {
    public static void main(String[] args) {

        // 더할 숫자와 누적합 초기화
        int number = 1;
        int total = 0;

        // break를 만날 때까지 반복
        while (true) {    
            total += number;  // 더할 숫자로 누적 합산

            // 100 초과시 종료
            if (total > 100) {
                break;
            }

            // 1씩 증가
            number++;
        }

        // 반복문과 분리하여 가독성 향상
        System.out.println("1 + 2 + ... + k 가 100을 넘는 최초의 k = " + number);  // 줄바꿈 출력문으로 스크립트 축소
        System.out.printf("(그때의 합 = %d)", total);
    }
}