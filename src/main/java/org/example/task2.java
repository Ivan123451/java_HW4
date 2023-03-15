package org.example;

import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список.
public class task2 {
    public static void main(String[] args) {
        LinkedList my_list = new LinkedList();
        Collections.addAll(my_list, "dog", "cat", "banana", "cave", "milk");
        revers(my_list);


    }

    private static void revers(LinkedList my_list) {
        Collections.reverse(my_list);
        System.out.println(my_list);

    }
}
