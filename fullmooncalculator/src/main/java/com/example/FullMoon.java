package com.example;

import java.util.Scanner;

public class FullMoon {
    public static void main(String[] args)
    {
        int[] fullMoons = {4, 3, 5, 4, 3, 2, 1, 31, 29, 27, 27, 25, 25};
        int month, day, fullMoonDay, fullMoonMonth;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter today's date for the next full moon: ");
        System.out.print("Month: ");
        month = scan.nextInt();
        System.out.print("Day: ");
        day = scan.nextInt();
        int place = month-1;

        if(fullMoons[place] > day )
        {
            fullMoonDay = fullMoons[place];
            fullMoonMonth = month;
        }
        else
        {
            fullMoonDay = fullMoons[month];
            fullMoonMonth = month + 1;
        }

        System.out.println("\nThe next full moon will be on " + fullMoonMonth + "/" + fullMoonDay + "/2015");
    }
}
