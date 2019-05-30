//Write a method named getEvenDigitSum with one parameter of the type "int".
//        The method should return the sum of even digits within the number.
//        If the number is negative, method should return -1;

package com.Less3Task6Package;

import java.util.Scanner;

public class SumOfDigits {

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        } else {
            String str = Integer.toString(number); // переволим полученное число в строку
            char[] charArray = str.toCharArray();  // загоняем символы строки в массив
            for (char aCharArray : charArray) {
                sum += Character.getNumericValue(aCharArray); // конвертируем символы в число и подсчитываем сумму
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int res;
        Scanner in = new Scanner(System.in);

        // вводим строку
        System.out.print("Input a number: ");
        String str = in.nextLine();
        // проверяем введены ли цифры, если нет - программа прекращает работу
        try {
            Integer.parseInt(str);

        } catch (Exception e) {
            System.out.println("It is not a digit or digit is too big");
            System.exit(0);
        }

        // получаем сумму цифр
        res = getEvenDigitSum(Integer.parseInt(str));

        // вывод результата
        if (res != -1) {
            System.out.println("\nThe sum of digit is: " + res);
        }
        else System.out.println(res);
    }
}
