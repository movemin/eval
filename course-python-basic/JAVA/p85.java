import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            // 인스턴스 객체를 생성하여 뒷공백 깔끔하게 제거하도록 설계
            StringBuilder sb = new StringBuilder();

            for (int num = 1; num * num <= n; num++) {
                
                if (num > 1) sb.append(" ");
                sb.append(num * num);
                
            }
            System.out.println(sb);
        }
    }
}