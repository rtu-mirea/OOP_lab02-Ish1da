package com.company;

import java.util.Scanner;

public class Task1 {
    String str = "";

    void Task1(){}

    void Task1(String str){
        this.str = str;
    }

    void In(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        if(this.str == "")
            this.str = str;
        else
            this.str += "\n" + str;
    }

    void In(String str){
        if(this.str == "")
            this.str = str;
        else
            this.str += "\n" + str;
    }

    void Clear(){
        str = "";
    }

    void Out(){
        System.out.println("Запись содержит следующие строки:");
        String[] lines = str.split("\\r?\\n");
        for (int i = 0; i < lines.length; i++)
            System.out.println(lines[i]);
    }

    void Up(){
        String[] lines = str.split("\\r?\\n");
        String[] tmp;
        for (int i = 0; i < lines.length; i++) {
            tmp = lines[i].split(" ");
            tmp[0] = tmp[0].toUpperCase();
            lines[i] = String.join(" ", tmp);
        }
        str = String.join("\n", lines);
        System.out.println("Запись изменена");
    }

    void FindS(){
        String[] lines = str.split("\\r?\\n");
        Scanner in = new Scanner(System.in);
        String res = "";
        System.out.println("Введите поставщика");
        String find = in.nextLine();
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].contains(find)){
                res += lines[i] + " ";
            }
        }
        System.out.println(res);
    }

    void CountCom(){
        String[] lines = str.split("\\r?\\n");
        int res = 0;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].split(",")[1].contains(".com")){
                res += 1;
            }
        }
        System.out.println("Контактов с доменом com " + res);
    }

    void FormF(){
        String[] lines = str.split("\\r?\\n");
        Scanner in = new Scanner(System.in);
        String res = "";
        System.out.println("Введите первую букву фамилии");
        String find = in.nextLine();
        for (int i = 0; i < lines.length; i++) {
            if(Character.toString(lines[i].charAt(0)).compareTo(find) == 0){
                res += lines[i].split(" ")[0] + "\n";
            }
        }
        System.out.println("Результат поиска:" + "\n" + res);
    }

    void Test(){
        In("Ямов И.О., hustler@mail.com");
        In("Имов А.О., hustler1@mail.ru");
        In("Рамов В.П., hustler2@mail.com");
        In("Яков Д.Р., hustler3@mail.ru");
        In("Илов Ф.Н., hustler4@mail.ru");
        In("Ионов П.Н., hustler5@mail.com");
        In("Жориков И.Р., hustler6@mail.com");
    }
}
