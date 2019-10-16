package com.company;

import java.util.Scanner;

public class Task2 {
    String str = "";

    void Task1(){}

    void Task1(String str){
        this.str = str;
    }

    void In(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        StringBuffer s = new StringBuffer();

        if(this.str == "")
            this.str = str;
        else
            s.append(this.str).append("\n").append(str);
            this.str = s.toString();
            //this.str += "\n" + str;
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

    void Change(){
        String[] lines = str.split("\\r?\\n");
        int res = 0;
        StringBuffer s;
        for (int i = 0; i < lines.length; i++) {
            s = new StringBuffer(lines[i]);
            if(s.substring(s.length() - 1).compareTo("@") == 0){
                s.replace(s.length() - 1, s.length() - 1, "@mail.ru");
                lines[i] = s.toString();
            }
        }
        str = String.join("\n", lines);
        System.out.println("Адреса отредактированы");
    }

    void Count(){
        String[] lines = str.split("\\r?\\n");
        int res = 0;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].split(" ")[2].contains("@")){
                res += 1;
            }
        }
        StringBuffer s = new StringBuffer();
        s.append("Количество контактов = " + res).append("\n").append(str);
        str = s.toString();
        System.out.println("Контакты посчитаны");
    }

    void Test(){
        In("Ямов И.О., hustler@mail.com");
        In("Имов А.О., hustler1@mail.ru");
        In("Рамов В.П., hustler2@mail.com");
        In("Яков Д.Р., hustler3@");
        In("Илов Ф.Н., hustler4@mail.ru");
        In("Ионов П.Н., hustler5@mail.com");
        In("Жориков И.Р., hustler6@");
    }
}
