import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int startNum = sc.nextInt();
            int endNum = sc.nextInt();
            // 가우스 공식으로 cpu 절약
            long totalSum = (startNum + endNum) * (endNum - startNum + 1) / 2;
            System.out.println("합계: " + totalSum);
        }
    }
}