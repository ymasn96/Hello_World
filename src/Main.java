import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String aboutMe = "Hello, my name is Yasir \nI love me some cereal.\nAlso so, so glad its Friday";
//        System.out.println(aboutMe);
//
//        String myIntro = "Yas said: \"Hello I have always lived here in the UK.\" Zift replied: \"Where would you like to move to?\"";

//        Scanner input = new Scanner(System.in);
//
//        int number1, number2;
//
//        System.out.println("Enter first number:");
//        number1 = input.nextInt();
//
//        System.out.println("Enter second number:");
//        number2 = input.nextInt();
//
//        int addition = number1 + number2;
//        int subtraction = number1 - number2;
//        int multiplication = number1 * number2;
//        int division = number1 / number2;
//
//        System.out.println("Addition for " + number1 + " and " + number2
//                + " is: " + addition);
//        System.out.println("Subtraction for " + number1 + " and " + number2
//                + " is: " + subtraction);
//        System.out.println("Multiplication for " + number1 + " and " + number2
//                + " is: " + multiplication);
//        System.out.println("Division for " + number1 + " and " + number2
//                + " is: " + division);


        int numberOfWalls, numberOfObjects;
        float length, width, wallArea, objLength, objWidth, objArea, totalAreaOfObjects ;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the area of one wall?");
        System.out.println("Enter the length:");
        length = in.nextFloat();
        System.out.println("Enter the width:");
        width = in.nextFloat();

        wallArea = length * width;

        System.out.println("The area of a wall is: " + wallArea +"m^2");

        System.out.println("How many walls are there?");
        numberOfWalls = in.nextInt();

        if (numberOfWalls > 1) {
            System.out.println("The total area of all the walls is: " + (numberOfWalls * wallArea) +"m^2");
            System.out.println("What objects are on the wall?");
            String object = in.next();

            System.out.println("What is the area of the " + object + "?");
            System.out.println("Enter its length:");
            objLength = in.nextFloat();
            System.out.println("Enter its width:");
            objWidth = in.nextFloat();

            System.out.println("How many " + object + "'s are there?");
            numberOfObjects = in.nextInt();

            objArea = objLength * objWidth;

            System.out.println(object + " area: " + objArea +"m^2");

            totalAreaOfObjects = objArea * numberOfObjects;

            if (numberOfObjects == 1) {
                System.out.println("There is only one " + object +".");
                System.out.println(object + " area: " + objArea +"m^2");

            } else if (numberOfObjects > 1) {
                System.out.println("There are " + numberOfObjects + " " + object + "s");
                System.out.println("The total area of all " + object + "is: " + totalAreaOfObjects +"m^2" );

            }


        } else if (numberOfWalls == 1) {
            System.out.println("The total area of the wall is: " + wallArea);
            System.out.println("What objects are on the wall?");
            String object = in.next();

            System.out.println("What is the area of the " + object + "?");
            System.out.println("Enter its length:");
            objLength = in.nextFloat();
            System.out.println("Enter its width:");
            objWidth = in.nextFloat();

            objArea = objLength * objWidth;

            System.out.println(object + " area: " + objArea +"m^2");

            System.out.println("Remaining wall area: " + (wallArea - objArea) +"m^2");

            System.out.println();
        }



//        int myAge = 25;
//
//        int x = 50;
//        int y = 10;
//
//        if (x > y) {
//            System.out.println("Greater");
//        } else if (x == y) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Less");
//        }


    }
}