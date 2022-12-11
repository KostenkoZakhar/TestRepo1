package homeWork10;

import java.util.*;

//Задача: Написать метод который принимает Map<Integer,String> выводит значения коллекции Map в консоль в виде:
//key1=value1
//key2=value2
//....
//keyn=valuen
//Вывод должен быть отсортирован в порядке по key.

public class HomeWork10 {

    public static void main(String[] args) {
        Map<Integer, String> mapSortedByKeys = new TreeMap<>();
        mapSortedByKeys.put(1111, "z");
        mapSortedByKeys.put(3, "b");
        mapSortedByKeys.put(5, "a");
        mapSortedByKeys.put(800, "c");
        mapSortedByKeys.put(4, "d");
        mapSortedByKeys.put(10, "e");
        mapSortedByKeys.put(7, "y");
        mapSortedByKeys.put(29991, "n");
        mapSortedByKeys.put(9, "j");
        mapSortedByKeys.put(60, "m");

        System.out.println("Map sorted by keys:");
        sortedByKeys(mapSortedByKeys);

    }

    private static void sortedByKeys(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}
