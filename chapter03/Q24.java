package HW.chapter01.chapter03;

public class Q24 {
    public static void main(String[] args) {
        int rank = (int) ((Math.random() * (14 - 1)) + 1);
        int suit = (int) (Math.random() * 4);

        System.out.print("The card you picked is ");
        switch (rank) {
            case 1:
                System.out.print("Ace");
                break;
            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.print(rank);
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
        }

        System.out.print(" of ");

        switch (suit) {
            case 0:
                System.out.println("Clubs");
                break;
            case 1:
                System.out.println("Diamonds");
                break;
            case 2:
                System.out.println("Hearts");
                break;
            case 3:
                System.out.println("Spades");
        }
    }
}
