package com.devfootcode;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int age = 30;
        int HerAge = age;
        Date now = new Date();
        System.out.println(now);
        System.out.println(HerAge);

        //reference.....................
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.y = 5;
        System.out.println(point2);
        //..............................

        //String and concatenation
        String text = "     c:\\Hello John\\" + "\"where\" are you from";
        System.out.println(text);
        System.out.println(text.indexOf("w"));
        System.out.println(text.replace("h", "l"));
        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.trim());
        //...............................


        //Arrays
        int[][] nums = new int[7][6]; //rows and columns
        nums[0][0] = 1;
        nums[1][0] = 2;
        nums[2][0] = 1;
        nums[3][0] = 3;
        //System.out.println(Arrays.toString(nums));
        //to print dimensional arrays
        System.out.println(Arrays.deepToString(nums));

        int[][] arry = {{2, 1, 3}, {3, 1, 3,}};
        System.out.println(Arrays.deepToString(arry));

        int[] numbers = {3, 59, 832, 93, 12, 239, 24};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        //...............................................

        //Constants
        final float PI = 3.142F;
        //...............................................

        //Arithmetics
        int myApples = (10 + 20) * 6;
        myApples++;
        myApples--;
        double book = (double) 40 / (double) 7;
        System.out.println(myApples);
        System.out.println(book);
        //......................................................

        //maths operation
        //first arg takes a float and returns an int second takes a double and return a long
        int res = Math.round(3.3F);
        int resp = (int) Math.ceil(3.3F);
        int respo = (int) Math.floor(3.3F);
        int respon = (int) Math.max(4, 6);
        double respons = Math.round(Math.random() * 84);

        System.out.println(res);
        System.out.println(resp);
        System.out.println(respo);
        System.out.println(respon);
        System.out.println(respons);
        //......................................................

        //Formatting
        //first arg takes a float and returns an int second takes a double and return a long
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(299.324);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(43);
        System.out.println(percentResult);

        //Method chaining
        String percentResult2 = NumberFormat.getPercentInstance().format(0.3);
        System.out.println(percentResult2);
        //................................. .....................



        //Reading Input from user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        //byte age1 = scanner.nextByte();
        String names = scanner.nextLine().trim();
        System.out.println("I am" + names);
        //......................................................
    }
}
