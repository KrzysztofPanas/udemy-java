package kpanas.home;
// write a method which sum all the digits in given number, grather than 9

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

    }

    private static int sumDigits(int number) {
        int sumOfNumber = -1;
        if(number >= 10) {
            sumOfNumber = 0;
            while (number > 0) {
                sumOfNumber += number%10;
                number = number / 10;
            }
        }
        return sumOfNumber;
    }
}
