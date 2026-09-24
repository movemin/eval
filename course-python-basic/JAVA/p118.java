import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            
            // if/else if/else로 양수/음수/영 분류 출력.
            if (number > 0) {
                System.out.println("양수");
            } else if (number < 0) {
                System.out.println("음수");
            } else {
                System.out.println("영");
            }
        }
    }
}