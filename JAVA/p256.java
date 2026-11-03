import java.util.Arrays;
import java.util.Scanner;

public class p256 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // 연속된 숫자 오름차순 배열
            Arrays.sort(arr);

            // 배열 길이, 현재 길이, 최대 길이, 결과값 저장
            int arrLen = arr.length;
            int curCount = 1;
            int maxCount = 1;
            int modeValue = arr[0];

            // 길이 갱신
            for (int idx = 1; idx < arrLen; idx++) {
                if(arr[idx] == arr[idx - 1]) {
                    curCount++;
                } else {
                    if(curCount > maxCount) {
                        maxCount = curCount;
                        modeValue = arr[idx - 1];
                    }
                    curCount = 1;
                }

            }

            // 마지막 그룹 반영
            if (curCount > maxCount) {
                modeValue = arr[n - 1];
            }


            // 최종 결과값 출력
            System.out.println("최빈값: " + modeValue);
        }
    }
}