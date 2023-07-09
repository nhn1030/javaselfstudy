package practice_for;

public class star {
    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 10 - j; i++) {
                System.out.print('★');
            }
            for (int i = 0; i < j; i++) {
                System.out.print('☆');
            }
            System.out.println();

        }
    }
}
