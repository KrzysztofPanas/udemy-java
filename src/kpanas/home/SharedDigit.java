package kpanas.home;

//Write a method named hasSharedDigit with two parameters of type int.
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//EXAMPLE INPUT/OUTPUT:
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers


public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int i, int j) {
        if (i < 10 || i > 99 || j < 10 || j > 99) return false;
        else {
            int digitOne = i % 10;
            int digitTwo = i / 10;
            int digitThree = j % 10;
            int digitFour = j / 10;
            if (digitOne == digitThree || digitOne == digitFour || digitTwo == digitThree || digitTwo == digitFour) return true;
            else return false;


        }

        }

}
