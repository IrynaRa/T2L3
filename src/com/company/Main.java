package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[]{2, 55, 67, 33, 12, 78};
        int min;
        min = array[0];
        int number = 0;

        for (int i = 0; i < array.length; i++)
        {

            if (min > array[i]) {
                min = array[i];
                number = i;
            }

        }
        System.out.println(" ");
        System.out.println("closest to " + min);
        System.out.println( "position number" + number);



    }
}
