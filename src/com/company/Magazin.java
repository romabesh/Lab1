package com.company;

import java.util.ArrayList;

public class Magazin {
    public static ArrayList<String> name_product = new ArrayList<>();
    public static ArrayList<String> name_magazin = new ArrayList<>();
    public static ArrayList<String> adress = new ArrayList<>();
    public static ArrayList<Integer> index = new ArrayList<>();
    public static ArrayList<Integer> prise = new ArrayList<>();
    public static ArrayList<Integer> quantitu = new ArrayList<>();

    public static void Menu(){
        System.out.println("\n\n1. Ввести данные: ");
        System.out.println("2. Вывести данные: ");
        System.out.println("3. Удалить данные: ");
        System.out.println("4. Выход: ");
        System.out.println("\nДля продолжения нажмите нужный вариант: ");
    }
}
