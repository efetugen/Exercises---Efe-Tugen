package HW.chapter01.chapter06;

public class Q38 {
    public static void main(String[] args) {
        final int NUMBER_OF_UPPERCASE_LETTERS = 100;
        final int NUMBER_OF_SINGLE_DIGITS = 100;
        final int NUMBERS_PER_LINE = 10;

        for (int i = 1; i <= NUMBER_OF_UPPERCASE_LETTERS; i++) {
            System.out.print(getRandomUpperCaseLetter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }

        for (int i = 1; i <= NUMBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(getRandomDigitCharacter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
