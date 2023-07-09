package ex10.continue_break.Switch;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int n = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("값을 SP로 구분해서 5개 이상 입력하세요");
        System.out.print("\n> ");


        while(scan.hasNext()) {

            n = scan.nextInt();

            if ( n < 10 ) {
                continue;
            }


            else if ( n > 200 ) {
                break;
            }

            System.out.println(n);
        }

    }
}