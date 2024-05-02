package Task4;
import java.util.Scanner;
import java.util.Random;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оценка за контрольную работу: ");
        int grades = scanner.nextInt();

    Random random = new Random();
        int grades1 = random.nextInt(13);
    int remainingTime = 45;

   switch (grades) {
        case 10:
        case 11:
        case 12:
            System.out.println("Горжусь тобой!");
            remainingTime += 60;
            break;
        case 7:
        case 8:
        case 9:
            System.out.println("Ок, посмотри телевизор.");
            remainingTime += 45;
            break;
        case 4:
        case 5:
        case 6:
            System.out.println("Я расстроена, потому что ты можешь .");
            remainingTime += 15;
            break;
        default:
            System.out.println("Трагедия. Сегодня ТВ смотреть запрещено.");
            remainingTime -= 30;
   }
 System.out.println("Оставшееся на сегодня время для просмотра ТВ: " + remainingTime + " минут");


}
}
