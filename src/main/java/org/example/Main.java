package org.example;

//Single line comment

/*
Multi line comment
 */

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        task1();
        task2();
        task3();
        }
    private static void task1(){
        System.out.println("TASK_1");
        //логический
        Boolean a = true;
        System.out.println("логический = " + a);
        //строковый
        String b = "String_Test";
        System.out.println("строковый = " + b);
        //символьный
        char c = '#';
        System.out.println("символьный = " + c);
        //целочисленный 2-й
        int d = 0b1111001;
        System.out.println("целочисленный 2-й = " + d);
        //целочисленный 8-й
        int e = 010;
        System.out.println("целочисленный 8-й = " + e);
        //целочисленный 10-й
        int f = 10;
        System.out.println("целочисленный 10-й = " + f);
        //целочисленный 16-й
        int g = 0xF;
        System.out.println("целочисленный 16-й = " + g);
        //литерал типа float
        float h = 10.1f;
        System.out.println("литерал типа float = " + h);
        //литерал типа double
        double i = 10.2;
        System.out.println("литерал типа double = " + i);
        System.out.println("Hello world!");
        }

    private static void task2(){
        System.out.println("TASK_2");
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        System.out.println("Сумма = " + calculatorDemo.calculateSumTwoValues(enterNum1(),enterNum2()));
        System.out.println("Разница = " + calculatorDemo.calculateSubtractionTwoValues(enterNum1(),enterNum2()));
        System.out.println("Умножение = " + calculatorDemo.calculateMultiplicationTwoValues(enterNum1(),enterNum2()));
        System.out.println("Деление = " + calculatorDemo.calculateDivisionTwoValues(enterNum1(),enterNum2()));
    }

    private static void task3(){
        fromByte();
        fromShort();
        fromChar();
        fromInt();
        fromLong();
        fromFloat();
        fromDouble();
    }
    private static int enterNum1(){
        Scanner scanner1 = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter Num1: ");
            try {
                num = scanner1.nextInt();
                break; // ввод корректный — выходим из цикла
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: The entered value (Num1) is not an integer.");
                scanner1.nextLine(); // очищаем некорректный ввод
            }
        }
        return num;
    }
    private static int enterNum2(){
        Scanner scanner2 = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter Num2: ");
            try {
                num = scanner2.nextInt();
                break; // ввод корректный — выходим из цикла
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: The entered value (Num2) is not an integer.");
                scanner2.nextLine(); // очищаем некорректный ввод
            }
        }
        return num;
    }
    static void fromByte() {
        byte b = 10;
        short s = b;         // неявное
        int i = b;           // неявное
        long l = b;          // неявное
        float f = b;         // неявное
        double d = b;        // неявное

        System.out.println("From byte: short=" + s + ", int=" + i + ", long=" + l + ", float=" + f + ", double=" + d);
    }

    static void fromShort() {
        short s = 100;
        byte b = (byte) s;   // явное
        int i = s;           // неявное
        long l = s;          // неявное
        float f = s;         // неявное
        double d = s;        // неявное

        System.out.println("From short: byte=" + b + ", int=" + i + ", long=" + l + ", float=" + f + ", double=" + d);
    }

    static void fromChar() {
        char c = 'A';
        int i = c;           // неявное
        long l = c;          // неявное
        float f = c;         // неявное
        double d = c;        // неявное

        byte b = (byte) c;   // явное
        short s = (short) c; // явное

        System.out.println("From char: byte=" + b + ", short=" + s + ", int=" + i + ", long=" + l + ", float=" + f + ", double=" + d);
    }

    static void fromInt() {
        int i = 1000;
        byte b = (byte) i;   // явное
        short s = (short) i; // явное
        char c = (char) i;   // явное
        long l = i;          // неявное
        float f = i;         // неявное
        double d = i;        // неявное

        System.out.println("From int: byte=" + b + ", short=" + s + ", char=" + c + ", long=" + l + ", float=" + f + ", double=" + d);
    }

    static void fromLong() {
        long l = 100000L;
        byte b = (byte) l;   // явное
        short s = (short) l; // явное
        char c = (char) l;   // явное
        int i = (int) l;     // явное
        float f = l;         // неявное
        double d = l;        // неявное

        System.out.println("From long: byte=" + b + ", short=" + s + ", char=" + c + ", int=" + i + ", float=" + f + ", double=" + d);
    }

    static void fromFloat() {
        float f = 123.45f;
        byte b = (byte) f;   // явное
        short s = (short) f; // явное
        char c = (char) f;   // явное
        int i = (int) f;     // явное
        long l = (long) f;   // явное
        double d = f;        // неявное

        System.out.println("From float: byte=" + b + ", short=" + s + ", char=" + c + ", int=" + i + ", long=" + l + ", double=" + d);
    }

    static void fromDouble() {
        double d = 456.78;
        byte b = (byte) d;   // явное
        short s = (short) d; // явное
        char c = (char) d;   // явное
        int i = (int) d;     // явное
        long l = (long) d;   // явное
        float f = (float) d; // явное

        System.out.println("From double: byte=" + b + ", short=" + s + ", char=" + c + ", int=" + i + ", long=" + l + ", float=" + f);
    }
}