/*
Ryan Brinkman
Rectangle Area And Perimeter
Page None
8/28/2024
*/

import java.util.Scanner;

public class rectangleAreaAndPerimeter
{
    public static void main(String[] args)
    {
        int length; // width of the rectangle
        int width; // height of the rectangle
        int area; // calculated area of the rectangle
        int perimeter; // calculated perimeter of the rectangle

        Scanner slave = new Scanner(System.in);

        // obtain info from the user
        System.out.print("Enter the length of the rectangle: ");
        length = slave.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        width = slave.nextInt();

        // calculate the area of the rectangle
        area = length * width;

        // calculate the perimeter of the rectangle
        perimeter = 2 * (length + width);

        // display the results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        slave.close();
    }
}