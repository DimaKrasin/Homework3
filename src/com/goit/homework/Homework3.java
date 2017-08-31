package com.goit.homework;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Homework3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Введите длину массива: ");

            int size = input.nextInt();
            int array[] = new int[size];

            System.out.println("Вводите массив: ");

            try {
                for (int i = 0; i < size; i++) {
                    array[i] = input.nextInt();
                }
            }catch(Exception e){
            System.out.println("Вы попытались записать недопустимое значение в массив");
            }

            magic(array);
        }

        public static void magic(int[] array){
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.valueOf(array[i]);
            }

            int max = array[0];
            int min = array[0];
            double num5 = 0;
            int maxrepit = 0;
            int minrepit = array.length ;

            for (int i = 0; i < array.length; i++) {

                if (array[i] > max) max = array[i];  //MIN
                if (array[i] < min) min = array[i];  //MAX
                if (array[i] == 5) ++num5;         //Repit of 5

                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                    }
                }

                int counter = 0;
                for(int c = 0; c < array.length; c++) {
                    if (array[i] == array[c]) counter++;
                }
                maxrepit = maxrepit < counter ? counter : maxrepit;
                minrepit = minrepit > counter ? counter : minrepit;
            }

            System.out.println("Ваш массив :" + Arrays.toString(array));
            System.out.println("Самое большое число :" + max);
            System.out.println("Самое маленькое число :" + min);
            System.out.println("Число пять встречаеться " + num5 + " раз(а)");
            System.out.println("Максимальное число повторений :" + maxrepit);
            System.out.println("Минимальное число повторений :" + minrepit);
        }
    }

















/*

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
            System.out.println("Минимальное число повторений :" + minrepit;
            */