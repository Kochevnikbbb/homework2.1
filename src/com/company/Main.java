package com.company;

import java.util.Random;

public class Main {


        public static void main(String[] args) {

            System.out.println(ageTemperature(27, 13));
            System.out.println(ageTemperature(45, -8));
            System.out.println(ageTemperature(29, -20));
            System.out.println(ageTemperature(7, 32));
            System.out.println(ageTemperature(20, 20));

            System.out.println(generateRandomAge() + " " + ageTemperature(generateRandomAge(), 10));
        }

        public static String ageTemperature(int age, int temperature) {
            String res = "Можно идти гулять!";
            String res2 = "Остовайтесь дома!";
            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
                return res;
            } else if (age <= 20 && temperature > 0 && temperature <= 28) {
                return res;
            } else {
                return age >= 45 && temperature >= -10 && temperature <= 25 ? res : res2;
            }
        }

        public static int generateRandomAge(){
            Random random = new Random();
            int a = random.nextInt(100);
            return a;
        }

}
