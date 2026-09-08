import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int startYear = sc.nextInt();
            int endYear = sc.nextInt();

            // startYear..endYear 순회하며 (year%4==0 && year%100!=0) || year%400==0 이면 count++.
            int count = 0;
            for (int year = startYear; year <= endYear; year++) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400==0) {
                    count++;
                }
            }

            // 최종 카운트 출력
            System.out.println("윤년 개수: " + count);
        }
    }
}