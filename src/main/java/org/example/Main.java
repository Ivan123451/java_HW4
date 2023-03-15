package org.example;


import java.util.LinkedList;
import java.util.Scanner;

//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная
//        была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Main {
    public static void main(String[] args) {
        boolean Flag = true;
        LinkedList my_list = new LinkedList();
        while(Flag == true) {
            Scanner in = new Scanner(System.in);
            System.out.println("введите слово:");
            String name = in.next();
            if (name.equals("print")) {
                System.out.println(my_list);
                break;
            }
            if (name.equals("revent")) {
                my_list.removeFirst();

            }
            else {
                my_list.addFirst(name);
            }


        }






    }
}