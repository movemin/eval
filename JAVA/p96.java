import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int minutes = sc.nextInt();

            // 분 시간으로 환산
            int hours = minutes / 60;

            // 나머지 분 저장
            int remain = minutes % 60;

            // format 메서드로 가독성 높게 출력
            System.out.printf("%d:%02d%n", hours, remain);
        }
    }
}