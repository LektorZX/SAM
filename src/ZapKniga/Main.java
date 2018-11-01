package ZapKniga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();

        int a = 1;
        while (a < 4) {
            if (a != 0)
                System.out.println("\n\n\n\n");
            System.out.println("1-вывести весь словарь ");
            System.out.println("2-поиск ");
            System.out.println("3-добавить/удалить данные ");
            System.out.println("4-выйти из программы ");
            System.out.print("Введите номер : ");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println("\n\n\n\n");
            a = 1;
            while (i > 4 || i < 1) {
                System.out.println("Корректно введите номер пункта меню! ");
                System.out.println("1-вывести весь словарь ");
                System.out.println("2-поиск ");
                System.out.println("3-добавить/удалить данные ");
                System.out.println("4-выйти из программы ");
                System.out.print("Введите номер : ");
                i = sc.nextInt();
                System.out.println("\n\n\n\n");
            }
            switch (i) {
                case 1: {//показать
                    logic.see();
                    break;
                }
                case 2: {//поиск
                    logic.seah();
                    break;
                }
                case 3: {//удалить добавить
                    int w = 0;
                    System.out.println(" 1 добавить данные");
                    System.out.println("2 удалить данные");
                    w = sc.nextInt();
                    while (w > 2 || w < 1) {
                        System.out.println(" 1 добавить данные");
                        System.out.println("2 удалить данные");
                        w = sc.nextInt();
                    }
                    if (w == 1) {
                        logic.Add();
                    }
                    if (w == 2) {
                        logic.Dell();
                    }
                    logic.see();
                    break;
                }
                case 4: {
                    a = 4;
                    break;
                }
            }
        }
        System.out.println("Всего хорошего!");


    }
}
