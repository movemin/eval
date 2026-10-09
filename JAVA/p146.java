import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // 바깥 i=0..N-1
            for (int i = 0; i < n; i++) {

                // 안쪽 j=0..N-1
                for(int j = 0; j < n; j++) {

                    // (i+j)%2==0 ? 'X' : '.'
                    System.out.print((i+j)%2==0 ? 'X' : '.');
                }

                // 줄바꿈
                System.out.println();
            }
        }
    }
}