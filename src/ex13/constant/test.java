package ex13.constant;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int[][] kors = new int[3][3];
        Scanner scan = new Scanner(System.in);

        // 성적 저장 부분
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                do {
                    System.out.printf("%d학년 국어의 %d번째 성적 :", j + 1, i + 1);
                    kors[j][i] = scan.nextInt();
                } while (kors[j][i] < 0 || 100 < kors[j][i]);
            }

        }


        // 성적 출력 부분
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d학년 국어의 %d번째 성적: %d\n", j + 1, i + 1, kors[j][i]);
            }
        }
    }
}