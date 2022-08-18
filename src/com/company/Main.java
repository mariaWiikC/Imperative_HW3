package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // ex 1
        for (int i = 10; i <= 37; i = i + 3)
            System.out.print(i + "  ");
        System.out.println(" ");

        // ex 2
        for (int i = 998; i >= 900; i = i - 2)
            System.out.print(i + "  ");
        System.out.println(" ");

        // ex 3
        for (int i = 1; i <= 10; i++)
        {
            for (int n = 1; n <= 2; n++)
                if (n == 1)
                    System.out.print(1 + "  ");
                else
                    System.out.print(-1 + "  ");
        }
        System.out.println(" ");

        // ex 4
        for (int i = 1; i <= 60; i++)
        {
            if (i%3 == 0)
                System.out.print(9 + "  ");
            else
                System.out.print(7 + "  ");
        }


    }
}
