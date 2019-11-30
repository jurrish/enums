package pens;

import java.util.Scanner;

public class PenStore
{
    private static final int VIEW_PENS = 1;
    private static final int SEARCH_PENS = 2;
    private static final int QUIT = 3;

    private static Scanner console = new Scanner(System.in);

    private static Pen[] inStock = {new Pen(PenType.BALL_POINT, PenThickness.FINE,PenColor.BLACK),
                                    new Pen(PenType.FOUNTAIN, PenThickness.REGULAR, PenColor.GREEN),
                                    new Pen(PenType.ROLLER_BALL, PenThickness.THICK, PenColor.BLUE)};

    public static void main(String[] args) {
        System.out.println("Welcome to my pen store");
        showMenu();
    }

    public static void showMenu()
    {
        while(true)
        {
            System.out.println("1. View pens");
            System.out.println("2. Search pens");
            System.out.println("3. Quit");

            int choice = console.nextInt();
            console.nextLine();

            if(choice == VIEW_PENS)
            {
                viewPens();
            } else if(choice == SEARCH_PENS)
            {
                searchPens();
            }
            else if(choice == QUIT)
            {
                break;
            }
        }
    }

    public static void viewPens()
    {
        for (int i = 0; i < inStock.length; i++)
        {
            System.out.println(inStock[i].toString());
        }
    }

    public static void searchPens()
    {
        System.out.println("Enter a pen type (BALL_POINT, ROLLER_BALL, FOUNTAIN)");
        String userInput = console.nextLine();

        PenType penType = PenType.valueOf(userInput);

        if(penType == PenType.BALL_POINT)
        {
            System.out.println("Printing out all ball-point pens");
        }
        else if(penType == PenType.FOUNTAIN)
        {
            System.out.println("We only sell premium fountain pens");
        }
        else if(penType == PenType.ROLLER_BALL)
        {
            System.out.println("All roller-balls are on sale");
        }

        for (int i = 0; i < inStock.length; i++)
        {
            if(inStock[i].getType() == penType)
            {
                System.out.println(inStock[i].toString());
            }
        }

    }
}
