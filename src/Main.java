public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Задание 1.1");
        int age=18;
        if (age>=18) {
            System.out.println("Поздравляю с совершенолетием");
        }
        if (age<18) {
            System.out.println("Необходимо дождаться совершенолетия");
        }

        System.out.println("Задание 1.2");
        int childrenAge=7;
        if (childrenAge<=7) {
            System.out.println("Ребенок ходит в школу");
        }

        int humanAge=18;
        if (humanAge>=18) {
            System.out.println("Человек может отправляться в университет");
        }

        int humanAge2=24;
        if (humanAge2>=24) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }

        System.out.println("Задание 1.3");
        int van=102;
        if (van==102);
        int seating=60;
        if (seating==60) {
            System.out.println("Сидяих мест нет");
        }

        System.out.println("Задание 2.1");
        int age1=18;
        if (age1>=18) {
            System.out.println("Поздравляю с совершенолетием");
        }
        else  {
            System.out.println("Необходимо дождаться совершенолетия");
        }

        System.out.println("Задание 2.2");
        int childrenAge1=7;
        if (childrenAge1<=7) {
            System.out.println("Ребенок ходит в школу");
        }
        else {
            System.out.println("Ребенок не ходит в школу");
        }

        int humanAge1=18;
        if (humanAge1>=18) {
            System.out.println("Человек может идти в университет");
        }
        else {
            System.out.println("Человек не может идти в университет");
        }

        int humanAge21=24;
        if (humanAge21>=24) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }
        else {
            System.out.println("Человек не окончил университет");
        }

        System.out.println("Задание 2.3");
        int van1=102;
        if (van1==102);
        int seating1=60;
        if (seating1==60) {
            System.out.println("Сидяих мест нет");
        }
        else {
            System.out.println("Стоячих мест 42");
        }

        System.out.println("Задание 3.1");
        int ageHuman1=4;
        if (ageHuman1>2&&ageHuman1<6) {
            System.out.println("Если возраст человека равен 4, то ему нужно ходить в детский сад");
        }
        if (ageHuman1>7&&ageHuman1<18) {
            System.out.println("Если возраст человека равен 13, то ему нужно ходить в школу");
        }
        if (ageHuman1>18&&ageHuman1<24) {
            System.out.println("Если возраст человека равен 21, то ему нужно ходить в университет");
        }
        if (ageHuman1>24) {
            System.out.println("Если возраст человека равен 37, то ему нужно ходить на работу");
        }

        System.out.println("Задание 3.2");
        int ageBaby=15;
        if (ageBaby<5) {
            System.out.println("Ребенок не может кататься на атракционе");
        }
        if (ageBaby>5&&ageBaby<14){
            System.out.println("Ребенок может кататься в сопровождении взрослого");
        }
        if (ageBaby>14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 3.3");
        int one=1;
        int two=2;
        int three=3;
        if (three==3||two<3||one<3) {
            System.out.println("Большим числом является 3");
        }
    }
}