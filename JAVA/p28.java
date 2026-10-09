import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int endNum = sc.nextInt();
            int startStepNum = sc.nextInt();
            long sum = 0;
            
            // 1..N 중 K의 배수만 합산. "<K>의 배수 합: <합>" 출력
            for (int num = startStepNum; num <= endNum; num += startStepNum) {
                sum += num;
            }

            System.out.println(startStepNum + "의 배수 합: " + sum);
        }
    }
}