package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 22.01.2016.
 */
public class Tests {

    /* Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/




    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String tempString = input.readLine();
        String tempNum2 = input.readLine();
        int m = Integer.parseInt(tempString);
        int n = Integer.parseInt(tempNum2);

        for (int i = 0; i < m; i ++ ){
            System.out.println();
            for (int j = 0; j < n; j++ ){
                System.out.print("8");
            }

        }



    }
}
