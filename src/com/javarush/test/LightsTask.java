package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 26.01.2016.
 * Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
 затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
 Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 Определить, сигнал какого цвета горит для пешеходов в этот момент.
 Результат вывести на экран в следующем виде:
 "зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
 Пример для числа 2.5:
 зеленый
 */
public class LightsTask {

    public static void ttt (double min) {
        double tt = min % 5;
        if (tt < 3)
            System.out.println("зеленый");
        if(tt >= 3 && tt < 4)
            System.out.println("желтый");
        if(tt >= 4 && tt <5  )
            System.out.println("красный");
    }







    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String tempNum = input.readLine();
        int tempI = Integer.parseInt(tempNum);
        ttt(tempI);
    }


}