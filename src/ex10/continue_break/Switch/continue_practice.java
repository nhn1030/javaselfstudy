package ex10.continue_break.Switch;

public class continue_practice {
    public static void main (String[] args) {

        for (int i = 0; i < 30; i++) {

            if (i % 2 == 0) {
                continue;
            }

            else if (i == 21) {
                break;
            }
            else {
                System.out.printf("%d번째 항목이 정상 출력 되었습니다.", i);
            }

            System.out.println();
        }

    }
}
