package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void menu()
    {
        System.out.println("Меню программы:");
        System.out.println("1.  Добавить строку");
        System.out.println("2.  Очистить запись");
        System.out.println("3.  Вывести запись");
        System.out.println("4.  Фамилии прописными буквами");
        System.out.println("5.  Поиск контактов");
        System.out.println("6.  Количество контактов с доменом com");
        System.out.println("7.  Фамилии по заданной букве");
        System.out.println("8.  Task1 Test");
        System.out.println("№. -------------------------------------");
        System.out.println("9.  Добавить строку");
        System.out.println("10. Очистить запись");
        System.out.println("11. Вывести запись");
        System.out.println("12. Починить адреса");
        System.out.println("13. Посчитать контакты");
        System.out.println("14. Task2 Test");
        System.out.println("№. -------------------------------------");
        System.out.println("15. Найти в строки цены");
        System.out.println("№. -------------------------------------");
        System.out.println("111. Повторный вывод меню");
        System.out.println("0. Завершение программы");
    }

    public static void main(String[] args) {
        int command;
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        menu();
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\nВведите команду ");
            command = in.nextInt();;
            switch (command)
            {
                case 0:
                {
                    System.out.print("program ended");
                    break;
                }
                case 1:
                {
                    t1.In();
                    break;
                }
                case 2:
                {
                    t1.Clear();
                    break;
                }
                case 3:
                {
                    t1.Out();
                    break;
                }
                case 4:
                {
                    t1.Up();
                    break;
                }
                case 5:
                {
                    t1.FindS();
                    break;
                }
                case 6:
                {
                    t1.CountCom();
                    break;
                }
                case 7:
                {
                    t1.FormF();
                    break;
                }
                case 8:
                {
                    t1.Test();
                    break;
                }
                case 9:
                {
                    t2.In();
                    break;
                }
                case 10:
                {
                    t2.Clear();
                    break;
                }
                case 11:
                {
                    t2.Out();
                    break;
                }
                case 12:
                {
                    t2.Change();
                    break;
                }
                case 13:
                {
                    t2.Count();
                    break;
                }
                case 14:
                {
                    t2.Test();
                    break;
                }
                case 15:
                {
                    t3.In();
                    break;
                }
                case 111:
                {
                    menu();
                    break;
                }
                default:
                    System.out.print("wrong command number");
            }
        } while (command != 0);
    }
}
