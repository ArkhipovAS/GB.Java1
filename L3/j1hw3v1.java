/**
* Java1 homework3 task1
* @Arkhipov Aleksandr
* @version Jul 20, 2018
*/

import java.util.Random;
import java.util.Scanner;
public class j1hw3v1 {

    public static void main(String[] args) {
        //Генерация компьютером числа
        Random rand = new Random ();
        int x = rand.nextInt( 10 );
        //System.out.println(x);

        //Диалог с пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 0 до 9 \nУ Вас 3 попытки отгадать число\n\n");

        for (int n=1; n<4; n++){

            System.out.println("Введите " + n + " вариант:");
            int a = scanner.nextInt();
            if (x == a) System.out.println("Вы угадали с " + n + " попытки");
            else if (x > a) System.out.println("Ваше число меньше");
            else if (x < a) System.out.println("Ваше число больше");
            else System.out.println("Ваше Вне диапазона");
            // Запрос на новую игру
            if (n==3){
                if (x!=a)System.out.print("3 попытки закончились. Вы проиграли!\n");
                System.out.println("\nПовторить игру? (1 - да\t0 - нет)\n");
                int v = scanner.nextInt();
                switch (v){
                    case 1: {
                        n=0;
                        break;
                    }
                    case 0: {
                        System.out.println("До новых встреч!");
                        break;
                    }
                    default: System.out.println("Введен неправильный вариант. Запустите игру заново.");
                }

            }
        }
    }
}
