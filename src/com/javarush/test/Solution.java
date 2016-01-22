package com.javarush.test;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
	// write your code here 777 rwer

     /*     Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print(name + "some text");*/

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();
        System.out.print(name + "some text");

    }
}

