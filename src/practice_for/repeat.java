package practice_for;

public class repeat {
    public static void main(String[] args){


        for (int i = 0; i < 5; i++) {

            if (i == 4) {
                System.out.printf("%c", 'A' + i);

            }
            else {
                System.out.printf("%c, ", 'A' + i);
            }
        }

    }

}