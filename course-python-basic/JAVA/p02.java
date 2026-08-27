import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // sc → scanner: 역할이 더 명확한 변수명
        int age = scanner.nextInt();

        // 나이가 18세 이상일 경우 '성인입니다' 출력
        if (age >= 18) {
            System.out.println("성인입니다");
        }
    }
}