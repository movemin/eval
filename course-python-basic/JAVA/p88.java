import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();

        // 시간과 분을 초단위로 풀고 입력받은 초와 덧셈하여 저장한 뒤 결과값 출력
        int total = hours*3600 + minutes*60 + seconds;
        System.out.println("총 " + total + "초");
    }
}