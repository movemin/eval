import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;

            // do-while 로 1..10 범위 N 받기
            do {
                n = sc.nextInt();
            } while (1 > n || n > 10);

            // for (i = N; i >= 1; i--) 공백 구분 출력. 줄바꿈 후 "발사"
            for (int number = n; number >= 1; number--) {
                System.out.print(number);

                // 1이면 줄바꿈, 아니면 뒤에 공백 출력 
                if (number == 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            
            // 최종적으로 "발사" 출력
            System.out.println("발사");
        }
    }
}