/*
 * Ryan Brinkman
 * Test Objects
 * Page None
 * 11/06/2024
 */

public class TestObjects {
    public static void main(String[] args) {
        // Using objects to add 10 different numbers from 0-9
        Number num1 = new Number();
        Number num2 = new Number();
        Number num3 = new Number();
        Number num4 = new Number();
        Number num5 = new Number();
        Number num6 = new Number();
        Number num7 = new Number();
        Number num8 = new Number();
        Number num9 = new Number();
        Number num10 = new Number();
        System.out.println(" " + (int)(num1.getNum()));
        System.out.println(" " + (int)(num2.getNum()));
        System.out.println(" " + (int)(num3.getNum()));
        System.out.println(" " + (int)(num4.getNum()));
        System.out.println(" " + (int)(num5.getNum()));
        System.out.println(" " + (int)(num6.getNum()));
        System.out.println(" " + (int)(num7.getNum()));
        System.out.println(" " + (int)(num8.getNum()));
        System.out.println(" " + (int)(num9.getNum()));
        System.out.println("+" + (int)(num10.getNum()));
        System.out.println("---");
        System.out.println((int)(num1.getNum() + num2.getNum() + num3.getNum() + num4.getNum() + num5.getNum() + num6.getNum() + num7.getNum() + num8.getNum() + num9.getNum() + num10.getNum()));
    }
}