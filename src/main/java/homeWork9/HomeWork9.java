package homeWork9;

import java.util.*;

//Задача: Написать метод который принимает строку . Разбить строку по словам убрав все разделители (пробелы, запятые, точки).
// Сделать набор слов уникальным и вывести результат в консоль, привести первую букву каждого слова в заглавную.
//Например метод принял "масло, масло, колбаса, молоко". Вывод в консоль:
//Масло
//Колбаса
//Молоко

public class HomeWork9 {

    public static void main(String[] args) {method("масло, масло, колбаса, молоко");}

    private static void method(String str) {
        String[] mass = str.replace(" ", "").split(",");
        Set<String> set = new HashSet<>(Arrays.asList(mass));
        for (String s : set) {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        }
    }
}
