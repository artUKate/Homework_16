package Task5;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int number;

        do {
            System.out.println("Введите четырёхзначное число: ");
            input = scanner.nextLine();
        } while (!luckyNumber(input));
        number = Integer.parseInt(input);
        System.out.println("Вы ввели число: " + number);

        if (luckyNumber(input)) {
            System.out.println("Число является счастливым билетом!");
        } else {
            System.out.println("Число не является счастливым билетом.");
        }

    }

    public static boolean luckyNumber(String input) {
        if (input.length() != 4) {
            return false;
        }
        int number = Integer.parseInt(input);
        int first = number / 1000;
        int second = (number / 100) % 10;
        int third = (number / 10) % 10;
        int fourth = number % 10;

        return (first + second) == (third + fourth);
    }}