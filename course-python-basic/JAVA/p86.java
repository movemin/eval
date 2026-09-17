import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 맨 뒤 공백 처리를 위해 스트링빌더 객체 사용
            StringBuilder sb = new StringBuilder();
            
            // 1부터 (2 * n - 1)까지 정수 순회
            for (int i = 1; i <= (2 * n - 1); i++) {
                
                // 해당 최솟값 추가
                sb.append(Math.min(i, 2 * n - i));
                
                // 마지막 값 외에 뒤에 공백 추가
                if (2 * n - i != 1) sb.append(" ");
            }

            // 객체에 들어간 리턴문 출력
            System.out.println(sb);
        }
    }
}