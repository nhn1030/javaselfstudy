package ex6.operator;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        int kor1, kor2, kor3;
        int total;
        float avg;

        Scanner scan = new Scanner(System.in);



        // ------ 성적 입력 부분 -------

        System.out.println("+---------------------------------+");
        System.out.println("|             성적 입력              |");
        System.out.println("+---------------------------------+");
        System.out.print("국어1: ");
        kor1 = scan.nextInt();

        int validate = (0<=kor1 && kor1 <=100)? 1 : 0;
        System.out.println(validate);

        System.out.print("국어2: ");
        kor2 = scan.nextInt();
        System.out.print("국어3: ");
        kor3 = scan.nextInt();

        // ------ 성적 출력 부분 -------

        total = kor1 + kor2 + kor3;
        avg = total / 3.0f;

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");
        System.out.printf("\n국어1: %d", kor1);
        System.out.printf("\n국어2: %d", kor2);
        System.out.printf("\n국어3: %d", kor3);
        System.out.printf("\n합계점수: %d", total);
        System.out.printf("\n평균: %f", avg);

    }
}
