package com.javarush.test;
import java.util.*;

/**
 * Created by user on 19.01.2016.
 */
public class BuzzTask {

    public static void number(int a) {
        if (a > 0 & a <= 100) {
            if (a % 3 == 0)
                System.out.println("Fizz");
            if (a % 5 == 0)
                System.out.println("Buzz");
            else if (a % 3 != 0 && a % 5 != 0)
                System.out.println("Get your number " + a);
        } else System.out.println("Number entered is not in range");
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number range 1 to 100");
        number(input.nextInt());
    }
}
