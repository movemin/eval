import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 시작값, 끝값, 스텝값 줄바꿈으로 구분해서 입력받기
            int startNum = sc.nextInt();
            int endNum = sc.nextInt();
            int step = sc.nextInt();

            // 입력받은 값으로 수열대로 순회
            for (int num = startNum; num <= endNum; num += step) {
                System.out.print(num);

                // 마지막 값이 아니라면 공백도 같이 출력
                if (num != endNum) {
                    System.out.print(" ");
                }
            }
        }
    }
}