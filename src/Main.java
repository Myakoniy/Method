public class Main {


    public static void main(String[] args) {
       //Zadaine 1
        System.out.println("Zadanie 1");

        int yea = 2016;
        yearVis(yea);

        //Zadanie 2
        System.out.println("Zadanie 2");

        int os = 1;
        int age = 2012;

        osCheck(os, age);

        //Zadanie 3
        System.out.println("Zadanie 3");

        int clientDistance = 32;

        cardDelivery(clientDistance);


    }

    public static void yearVis (int x) {

        int year = x;

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("год не является високосным");
        } else {
            System.out.println("Год является вискокосным");
        }
    }

    public static void osCheck(int x, int y) {

        int clientOSi = x;
        int teleAge = y;

        if (clientOSi == 0 && teleAge >= 2015) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        }
        if (clientOSi == 0 && teleAge < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }

        if (clientOSi == 1 && teleAge >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }

        if (clientOSi == 1 && teleAge < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void cardDelivery(int x) {

        int deliveryDistance = x;


        if (deliveryDistance < 20) {
            System.out.println("Ваша карта будет доставлена в течение суток");
        }

        if (deliveryDistance >=20 &&  deliveryDistance <60) {
            System.out.println("Ваша карта будет доставлена в течение двух суток");
        }

        if (deliveryDistance >=60 &&  deliveryDistance <100) {
            System.out.println("Ваша карта будет доставлена в течение трех суток");
        }
    }



}
