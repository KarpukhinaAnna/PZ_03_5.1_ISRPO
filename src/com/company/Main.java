package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("результат вычисления для x=3.27" );
        System.out.println(func(3.27));
        System.out.println("результат вычисления для x=-1.93" );
        System.out.println(func(-1.93));
    }
    public static double func(double x)
    {
        double y;
        double a=4.17, b=2.24;
        if(x>0) {
            y = 2 + Math.exp (a + Math.sqrt (x)) ;
        }
        else {
            y = Math.pow (Math.sin (b*x), 3);
        }
        return y;
    }
}
