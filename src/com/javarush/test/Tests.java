package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 22.01.2016.
 */
public class Tests {

    /* Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует
*/
    public static void data( int num, int num2,int num3) {
        if (num + num2 > num3 && num + num3 > num2 && num2 + num3 > num)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");




    }


    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String tempNum = input.readLine();
        String tempNum2 = input.readLine();
        String tempNum3 = input.readLine();
        int tempInt = Integer.parseInt(tempNum);
        int tempInt2 = Integer.parseInt(tempNum2);
        int tempInt3 = Integer.parseInt(tempNum3);
        data(tempInt, tempInt2, tempInt3);


    }
}
