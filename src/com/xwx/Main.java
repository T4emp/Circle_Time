package com.xwx;

public class Main {

    public static void main(String[] args) {
        //TestCircle
        System.out.println("TestCircle:");
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.setColor("red");
        c1.setRadius(50);
        c2.setRadius(40);
        c2.setColor("blue");

        System.out.println(c1.getColor());
        System.out.println(c2.getRadius());
        //Вывод конкретных свойств

        //TestTime
        System.out.println("TestTime:");
        Time t1 = new Time(1,2,3);
        //Вывод результата автоматический

        Time t2 = new Time();
        //Вывод результата автоматический

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(66);
        System.out.println(t1);
        System.out.println("Час: " + t1.getHour());
        System.out.println("Минута: " + t1.getMinute());
        System.out.println("Секунда: " + t1.getSecond());

        t1.setTime(58,59,23);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}