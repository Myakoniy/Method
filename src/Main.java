import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
       //Zadaine 1
        System.out.println("Zadanie 1");


        yearVis();

        //Zadanie 2
        System.out.println("Zadanie 2");

        int os = 0;
        int age = 2019;

        osCheck(os, age);

        //Zadanie 3
        System.out.println("Zadanie 3");

        int totalDay = cardDelivery(25);
        System.out.println(totalDay);

    }

    public static void yearVis () {

        int currentYear = LocalDate.now().getYear();

        if (currentYear % 4 != 0 || currentYear % 100 == 0 && currentYear % 400 != 0) {
            System.out.println("год не является високосным");
        } else {
            System.out.println("Год является вискокосным");
        }
    }

    public static void osCheck(int clientOSi, int teleAge) {

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

    public static int cardDelivery (int deliveryDistance) {

        int deliveryDay = 0;


        if (deliveryDistance < 20) {

            deliveryDay = 1;
        }

        if (deliveryDistance >=20 &&  deliveryDistance <60) {

            deliveryDay = 2;
        }

        if (deliveryDistance >=60 &&  deliveryDistance <100) {
            deliveryDay = 3;
        }

        return deliveryDay;
    }



}
