package BJ;

import java.util.Scanner;

public class sugar2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        // 5kg 봉지를 최대한 먼저 사용
        while (N >= 0) {
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                return;
            }
            N -= 3;
            count++;
        }

        // 정확히 나눌 수 없는 경우
        System.out.println(-1);
    }
}
