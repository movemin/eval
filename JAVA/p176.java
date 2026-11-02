import java.util.Scanner;
public class p176 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 이전값, 위치값, 방향 전환 횟수 초기화
            int prev = sc.nextInt();
            int direction = 0;
            int changes = 0;

            // 두 번째 원소부터 마지막까지 순회
            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();

                // 현재 방향: 증가면 1, 감소면 -1, 같으면 0
                int curDir = curr > prev ? 1 : (curr < prev ? -1 : 0);

                // 같은 값이면 방향 전환 없음 — prev만 갱신 후 다음으로
                if (curDir == 0) { prev = curr; continue; }

                // 이전 방향이 존재하고 현재 방향이 다르면 전환 카운트
                if (direction != 0 && curDir != direction) changes++;

                // 방향·이전값 갱신
                direction = curDir; prev = curr;
            }

            // 최종 결과값 출력
            System.out.println("전환: " + changes);
        }
    }
}