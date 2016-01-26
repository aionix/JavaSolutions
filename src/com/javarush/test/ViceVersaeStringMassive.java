package com.javarush.test;

/**
 * Created by user on 26.01.2016.
 */
public class ViceVersaeStringMassive {


    static String abc = "Алена";

    public static void main(String[] args){
 //   public void data(String abc) {

        for (int i = (abc.length() - 1); i >= 0; i--) {
            System.out.println(abc.charAt(i));
        }
    }
}
