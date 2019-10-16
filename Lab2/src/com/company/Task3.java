package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    Pattern pat = Pattern.compile("\\d+(,?\\d*)*");
    String str = "";

    void Task1(){}

    void Task1(String str){
        this.str = str;
    }

    void In(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        Matcher matcher = pat.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
