public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");
        int clientOS0=0;
        int clientOS1=1;

        if (clientOS0==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear=2017;
        int clientDeviceYearIos=2017;
        int clientDeviceYearAndroid=2017;

        if (clientDeviceYearIos<=2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYearAndroid<=2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear>=2016) {
            System.out.println("Установите обычную версию, для телефонв iOS и Android");
        }

        System.out.println("Задание 3");
        int year=2021;
        switch (year) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
        }

        System.out.println("Задание 4");
        int deliveryDistanse=95;
        if (deliveryDistanse<=20) {
            System.out.println("Доставка в пределах 20 км занимает 1 день");
        } else if (deliveryDistanse>21&&deliveryDistanse<=60) {
            System.out.println("Доставка в пределах от 20 км до 60 км доставка занимает два дня");
        } else if (deliveryDistanse>60&&deliveryDistanse<=100) {
            System.out.println("Доставка в пределах 60 км до 100 км доставка занимает три дня");
        }


        System.out.println("Задание 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}