/*
 * Ryan Brinkman
 * Hurricane
 * Page 109
 * 9/9/2024
 */

import java.util.Scanner;

public class Hurricane
{
    public static void main(String[] args)
    {
        // Declare variables
        int windSpeed;

        Scanner slave = new Scanner(System.in); // Create new scanner object

        // Obtain user input
        System.out.print("Enter the wind speed: ");
        windSpeed = slave.nextInt();

        slave.close(); // Close the scanner

        // Display the hurricane category
        switch (windSpeed)
        {
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                System.out.println("Category 1 Hurricane.");
                break;

            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
                System.out.println("Category 2 Hurricane.");
                break;

            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
                System.out.println("Category 3 Hurricane.");
                break;

            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
                System.out.println("Category 4 Hurricane.");
                break;

            case 156:
            default:
                System.out.println("Category 5 Hurricane.");
                break;
        }
    }
}