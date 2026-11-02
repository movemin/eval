import java.util.Scanner;

public class p235 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // 합계 초기화
            int sum = 0;

            // 인덱스 순회하여 입력값 받고 누적합
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            // 평균값 저장, 카운터 초기화, 항목 순회 후 카운터
            double avg = (double) sum / n;
            int count = 0;
            for (int num : arr) {
                if (num > avg) {
                    count++;
                }
            }

            // 카운터 출력
            System.out.println("개수: " + count);
        }
    }
}