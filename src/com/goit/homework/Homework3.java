package com.goit.homework;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Homework3 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList list = new ArrayList();

            System.out.println("Вводите массив :");
            list.add(sc.nextLine());

            String str = list.get(0).toString();
            String[] array = (str.replaceAll("\\D+", " ").trim()).split(" ");
            int[] mas = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                mas[i] = Integer.valueOf(array[i]);
            }

                int max = mas[0];
                int min = mas[0];
                double num5 = 0;
                int maxrepit = 0;
            int minrepit = mas.length ;

            for (int i = 0; i < mas.length; i++) {

                if (mas[i] > max) max = mas[i];  //MIN
                if (mas[i] < min) min = mas[i];  //MAX
                if (mas[i] == 5) ++num5;         //Repit of 5

                for (int j = 0; j < i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int t = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = t;
                    }
                }

                int counter = 0;
                for(int c = 0; c < mas.length; c++) {
                    if (mas[i] == mas[c]) counter++;
                }
                maxrepit = maxrepit < counter ? counter : maxrepit;
                minrepit = minrepit > counter ? counter : minrepit;
            }

            System.out.println("Ваш массив :" + Arrays.toString(mas));
            System.out.println("Самое большое число :" + max);
            System.out.println("Самое маленькое число :" + min);
            System.out.println("Число пять встречаеться " + num5 + " раз(а)");
            System.out.println("Максимальное число повторений :" + maxrepit);
            System.out.println("Минимальное число повторений :" + minrepit);

        }
    }