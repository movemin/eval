import java.util.Scanner;

public class p222 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            
            int[] digitCount = new int[10];

            long remaining = n;

            // 각 자릿수를 추출하며 중복 여부 즉시 검사
            while (remaining > 0) {
                int digit = (int)(remaining % 10);
                digitCount[digit]++;
                if (digitCount[digit] >= 2) {
                    System.out.println("중복 있음");
                    return;  // 중복 만나면 즉시 종료
                }

                remaining /= 10;
            }
            System.out.println("모두 다름");
        }
    }
}