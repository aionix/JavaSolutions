package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 22.01.2016.
 */
public class Tests {

    /* Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
*/




    public static void main(String[] args) throws IOException {

    int b = 8;
            for (int i = 0; i < 10; i ++ ){
            System.out.println();
            for (int j = i; j > 0; j-- ){
                System.out.print(b);
            }

            }


    }
}
