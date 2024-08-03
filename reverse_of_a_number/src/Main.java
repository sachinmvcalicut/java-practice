import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = getNumberFromKeyboard();
        int rev = getReverse(number);
        System.out.println("Reverse : " + rev);
    }

    static int getNumberFromKeyboard() {
        System.out.println("Enter which number you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int getReverse(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + (number % 10);
            number = number / 10;
        }
        return rev;
    }
}