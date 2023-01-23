package org.example;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ex6_1();
        Ex7_1();
        Ex8_1();
    }

    // Задания на 19.01
    /*public  static void Ex1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество купленных чашек кофе: ");
        int countCoffee = in.nextInt();
        System.out.println("Вы получите бесплатно " + countCoffee/6 + " 24 кофе");
    }

    public  static void Ex2(){
    Scanner in = new Scanner(System.in);
    double x1, y1, x2, y2;
    System.out.print("Введите значение координаты х1: ");
    x1 = in.nextDouble();
    System.out.print("Введите значение координаты у1: ");
    y1 = in.nextDouble();
    System.out.print("Введите значение координаты х2: ");
    x2 = in.nextDouble();
    System.out.print("Введите значение координаты у2: ");
    y2 = in.nextDouble();
    double result =Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)), 0.5);
     System.out.print(result);
    }

    public static void Ex3(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите количество куриц на ферме: ");
        int chicken = in.nextInt();
        System.out.print("Введите количество свиней на ферме: ");
        int pig = in.nextInt();
        System.out.print("Введите количество коров на ферме: ");
        int cow = in.nextInt();
        int countLegs = 2*chicken + 4*(pig + cow);
        System.out.println("Количестов всего ног на ферме равно: " + countLegs);
    }
    public  static void Ex4(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n6Введите день недели: ");
        String dayWeek = in.nextLine();
        System.out.print("Введите месяц: ");
        String mounth = in.nextLine();
        System.out.print("Введите дату: ");
        int date = in.nextInt();
        System.out.println("Сегодня " + dayWeek + " такая дата " + date + " и такой месяц " + mounth);
    }*/

    //Задания на 23.01

    public static void Ex1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Деление на 3");
        System.out.print("\nВведите любое число для проверки: ");
        int num = in.nextInt();
        if(num%3 == 0){
            System.out.print("Ваше число делится целочисленно на 3.");
        }
        else{
            System.out.print("Ваше число не прошло проверку на деление!");
        }

    }
    public static void Ex2(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nДеление на 5 и на 7");
        System.out.print("\nВведите любое число для проверки: ");
        int num = in.nextInt();
        if(num%5 == 2 && num%7 == 1){
            System.out.print("Ваше число удовлетворяет условию на деление.");
        }
        else{
            System.out.print("Ваше число не прошло проверку на деление!");
        }
    }

    public static  void Ex3(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nДеление на 4 и больше 10");
        System.out.print("\nВведите любое число для проверки: ");
        int num = in.nextInt();
        if(num%4 == 0 && num >= 10){
            System.out.print("Ваше число удовлетворяет условию на деление.");
        }
        else{
            System.out.print("Ваше число не прошло проверку на деление!");
        }
    }

    public static void Ex4() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nДиапазон от 5 до 10");
        System.out.print("\nВведите любое число для проверки: ");
        int num = in.nextInt();
        if(num >= 4&& num <= 10){
            System.out.print("Ваше число удовлетворяет условию.");
        }
        else{
            System.out.print("Ваше число не прошло проверку!");
        }
    }

    public static void Ex5(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nТысячи");
        System.out.print("\nВведите любое число для проверки тысяч в числе: ");
        int num = in.nextInt();
        if(num < 100){
            System.out.print("В веденном числе невозможно проверить значение тысяч");
        }
        else{
            int result = (num/1000)%10;
            System.out.print("В веденном числе " + result+ " тысяч");
        }
    }
    public static void Ex6(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nСумма чисел");
        System.out.print("\nВведите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.print("Сумма введенных Вами чисел равна: " + sum);
    }

    public static void Ex6_1(){
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число: "));
        JFrame frame = new JFrame();
        int result = num1 + num2;
        JOptionPane.showMessageDialog(frame,"Сумма введенных Вами чисел равна: " + result);
    }
    public static void Ex7(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nПоследовательность");
        System.out.print("\nВведите любое число: ");
        int num = in.nextInt();
        System.out.print("Число, идущее перед введенном числом: "+ (num -1) +
                "\nВаше число: " + num +
                "\nЧисло, следующее за введенным: " + (num + 1));
    }

    public static void Ex7_1(){
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Введите любое число: "));
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Число, идущее перед введенном числом: "+ (num -1) +
                "\nВаше число: " + num +
                "\nЧисло, следующее за введенным: " + (num + 1));
    }
    public static void Ex8(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nСумма и разность чисел");
        System.out.print("\nВведите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        int diff = num2-num1;
        System.out.print("Сумма введенных Вами чисел равна: " + sum +
                "\nА разность этих же чисел равна: "+ diff);
    }

    public static void Ex8_1(){
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число: "));
        JFrame frame = new JFrame();
        int sum = num1+num2;
        int diff = num2-num1;
        JOptionPane.showMessageDialog(frame,"Сумма введенных Вами чисел равна: " + sum +
                "\nА разность этих же чисел равна: "+ diff);
    }






}