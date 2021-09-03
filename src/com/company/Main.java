package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {4, -2.3, 7.4, -0.5, 10, 16.4, -9.1, 18.2, 0.2, 3.4, -14.2, 28, 99.9, -0.12, 3.12};
        double averageNum = 0;
        int arrayLenght = 0;
        boolean hasNegative = false;

        for (double tempVar : nums) {
            if (tempVar <= 0 && !hasNegative) {
                hasNegative = true;
            }

            if (tempVar > 0 && hasNegative) {
                arrayLenght++;
                averageNum = averageNum + tempVar;
                System.out.println("sssss " + averageNum);
            }
        }
        System.out.println("На сколько делить " + arrayLenght);

        System.out.println("Среднее арифметическое: " + averageNum / arrayLenght);

    }
}
