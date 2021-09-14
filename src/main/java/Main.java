import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = -18;
        int c = 5;
        compareNum(a, b);
        checkPositive(a);
        checkNegative(b);
        printConsole(c);
    }

    //Задание 1//
    public static boolean compareNum(int a, int b) {
        System.out.println("Задание 1:");
        int sum = a + b;
        if(sum >= 10 && sum <=20){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }

    //Задание 2//
    public static void checkPositive(int a) {
        System.out.println("Задание 2:");
        if(a >= 0) {
            System.out.println("Передали положительное число");
        }
        else {
            System.out.println("Передали отрицательное число");
        }
    }

    //Задание 3//
    public static boolean checkNegative(int b){
        System.out.println("Задание 3:");
        if(b >= 0){
            System.out.println("Число отрицательное");
            return true;
        }
        else{
            System.out.println("Число положительное");
            return false;
        }
    }

    //Задание 4//
    public static void printConsole(int c) {
        System.out.println("Задача 4: ");
        for (int i = 0; i < c; i++) {
            System.out.println("Печать строки");
        }
    }


}
