import java.util.Scanner;

public class p276 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            // 최대 합, 최대 행 초기화 (0번 행 기준으로 초기화하여 음수 케이스도 안전하게 처리)
            int bestSum = 0;
            int bestIdx = 0;

            for (int i = 0; i < row; i++) {
                int sum = 0;
                for (int j = 0; j < col; j++) {
                    sum += sc.nextInt(); // 2차원 배열 저장 없이 바로 누적
                }
                // i==0 이면 무조건 초기화, 이후엔 엄격히 클 때만 갱신
                if (i == 0 || sum > bestSum) {
                    bestSum = sum;
                    bestIdx = i;
                }
            }

            System.out.println("최대 행: " + bestIdx);
        }
    }
}