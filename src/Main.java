import java.util.Arrays;

public class Main {

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void offerVersion(int clientDeviceYear, int clientOS) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
                ;
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }

    public static String calculateDeliveryTime(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance > 100) {
            return ("Доставка не осуществляется.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
        }
        return ("Потребуется дней: " + day);
    }


    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int year = 2022;
        checkYear(year);

        System.out.println("Задача 2:");
        int currentClientDeviceYear = 2016;
        int currentClientOS = 1;
        offerVersion(currentClientDeviceYear, currentClientOS);

        System.out.println("Задача 3:");
        int deliveryDistance = 95;
        String deliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println(deliveryTime);
    }
}