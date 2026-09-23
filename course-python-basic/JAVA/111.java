import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int commonDifference = sc.nextInt();
            int termIndex = sc.nextInt();

            // 등차수열을 수식으로 연산
            int term = firstNum + (termIndex-1) * commonDifference;
            System.out.println(termIndex + "번째 항: " + term);
        }
    }
}