import java.util.Scanner;

public class p185 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // LSB부터 순회하며 1과 1 사이의 0 구간 최대 길이를 구한다
            int best = 0;
            int current = 0;
            boolean started = false;

            while (n > 0) {
                int bit = n % 2;
                if (bit == 1) {
                    if (started && current > best) {
                        best = current; // 이전 구간과 비교해 최댓값 갱신
                    }
                    started = true;
                    current = 0;
                } else {
                    if (started) current++;
                }
                n /= 2;
            }

            System.out.print(best);
        }
    }
}