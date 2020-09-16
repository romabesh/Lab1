package com.company;

import java.util.ArrayList;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean bool = true;
        for(;;) {
            if(bool == true) {
                Magazin.Menu();
                int Menu = in.nextInt();
                switch (Menu) {
                    case 1:
                        int number;
                        System.out.println("Введите название магазина: ");
                        Magazin.name_magazin.add(in.next());

                        System.out.println("Введите адресс: ");
                        Magazin.adress.add(in.next());

                        System.out.println("Выберете продукт: ");
                        Magazin.name_product.add(in.next());

                        System.out.println("Выберете количество: ");
                        while (true) {
                            try {
                                number = Integer.parseInt(in.next());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        Magazin.quantitu.add(number);

                        System.out.println("Цена товара: ");
                        while (true) {
                            try {
                                number = Integer.parseInt(in.next());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        Magazin.prise.add(number);

                        System.out.println("Индекс товара: ");
                        while (true) {
                            try {
                                number = Integer.parseInt(in.next());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        Magazin.index.add(number);

                        break;
                    case 2:
                        System.out.println(" Столбец    ");
                        System.out.println(" Магазина   " + Magazin.name_magazin);
                        System.out.println(" Адресс     " + Magazin.adress);
                        System.out.println(" Продукт    " + Magazin.name_product);
                        System.out.println(" Количество " + Magazin.quantitu);
                        System.out.println(" Цена       " + Magazin.prise);
                        System.out.println(" Индекс     " + Magazin.index);
                        break;
                    case 3:
                        System.out.println("Выберете нужный столбец для удаления :");
                        int remove = in.nextInt() - 1;

                        Magazin.name_magazin.remove(remove);
                        Magazin.adress.remove(remove);
                        Magazin.name_product.remove(remove);
                        Magazin.quantitu.remove(remove);
                        Magazin.prise.remove(remove);
                        Magazin.index.remove(remove);
                        break;
                    case 4:
                        bool = false;
                        break;
                }
            }
            else
                break;
        }
    }
}
