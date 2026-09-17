import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        // 시간 저장
        int hours = total/3600;

        // 분을 저장하기 위해 시간을 분단위로 한 값을 뺀 정수 저장
        int rem = total%3600;

        // 분 저장
        int minutes = rem/60;

        // 초 저장
        int seconds = rem%60;

        // format으로 시간 분 초 출력
        System.out.printf("%d시간 %d분 %d초", hours, minutes, seconds);
    }
}