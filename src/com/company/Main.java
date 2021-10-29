package com.company;

public class Main {


        public static void main(String[] args) {
            System.out.println(ageTemperature(45, 10));
            System.out.println(ageTemperature(45, -8));
            System.out.println(ageTemperature(29, -20));
            System.out.println(ageTemperature(7, 32));
            System.out.println(ageTemperature(20, 20));
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

}
