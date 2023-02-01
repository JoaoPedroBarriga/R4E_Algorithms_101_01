import java.util.Scanner;

public class Main {

    ///// Group I - Reading/Writing ; Variables /////
    static Scanner in = new Scanner(System.in);

    private static void Ex01() {
        String name;

        System.out.println("\n===== Ex 01 =====\n" + "What's your name?");
        name = in.nextLine();

        System.out.println("Hello " + name + "!");
    }

    private static void Ex02() {

        int n1, n2, sum;   //Variables definition

        System.out.println("\n===== Ex 02 =====\n" + "First number:");
        n1 = in.nextInt();

        System.out.println("Second Number?");
        n2 = in.nextInt();

        sum = n1 + n2;
        System.out.println("The sum is: " + sum);
    }

    private static void Ex02_Doubles() {

        double n1, n2, sum;

        System.out.println("\n===== Ex 02(Doubles) =====\n" + "First number (for double, use comma):");
        n1 = in.nextDouble();

        System.out.println("Second number (for double, use comma):");
        n2 = in.nextDouble();

        sum = n1 + n2;
        System.out.println("The sum is: " + (sum));
    }

    private static void Ex03() {

        double n1, n2, diference;

        System.out.println("\n===== Ex 03 =====\n" + "First number (for double, use comma):");
        n1 = in.nextDouble();

        System.out.println("Second number (for double, use comma):");
        n2 = in.nextDouble();

        diference = n1 - n2;
        System.out.println("The diference is: " + (diference));
    }

    private static void Ex04() {

        Scanner in = new Scanner(System.in);
        double height, base, area;

        System.out.println("\n===== Ex 04 =====\n" + "Triangles height:");
        height = in.nextDouble();

        System.out.println("Triangles base:");
        base = in.nextDouble();

        area = (height * base) / 2;
        System.out.println("Triangles area: " + area);
    }

    private static void Ex05() {

        //In this exercise it makes sense to create conditions for CHANGE 0, and for INSUFFICIENT AMOUNT
        double paidAmount, productPrice, change;

        System.out.println("\n===== Ex 05 =====\n" + "Paid Amount:");
        paidAmount = in.nextDouble();

        System.out.println("Product price:");
        productPrice = in.nextDouble();

        change = paidAmount - productPrice;

        if (change == 0) {
            System.out.println("Right amount paid, no change");
        } else if (change > 0) {
            System.out.println("The returned change is: " + change);
        } else System.out.println("Still have to pay" + Math.abs(change) + " euros.");
    }

    private static void Ex06() {

        double priceKg, amountConsumed, finalPrice;

        System.out.println("\n===== Ex 06 =====\n" + "Price per kg:");
        priceKg = in.nextDouble();

        System.out.println("Amount consumed:");
        amountConsumed = in.nextDouble();

        finalPrice = priceKg * amountConsumed;
        System.out.println("The price to pay is: " + finalPrice + " euros.");
    }

    private static void Ex07() {

        String name;
        double factoryPrice, finalPrice;
        final double dealersCommission = 0.28, taxAmount = 0.45;    //final - indicates that it will be constant (the value cannot be changed after receiving a first value)

        System.out.println("\n===== Ex 07 =====\n" + "Car brand?");
        name = in.nextLine();   //Fiat

        System.out.println("Factory's price for " + name + "?");
        factoryPrice = in.nextDouble(); //10

        finalPrice = factoryPrice + (factoryPrice * taxAmount) + (factoryPrice * dealersCommission);
        //finalPrice = 10 + (10 * 0.45) + (10 * 0.28)

        System.out.println("The car " + name + " costs " + finalPrice);

    }

    ///// Group II - Conditions /////

    private static void Ex08() {


        double n1, n2;

        System.out.println("\n===== Ex 08 =====\n\n" + "First value: ");
        n1 = in.nextDouble();

        System.out.println("Second value: ");
        n2 = in.nextDouble();

        if (n1 == n2) {
            System.out.println("Same values");
        } else if (n1 > n2) {
            System.out.println("The biggest value is " + n1);
        } else {
            System.out.println("The biggest value is " + n2);
        }
    }

    private static void Ex09() {

        double n1, n2, n3, n4;

        System.out.println("\n===== Ex 09 =====\n" + "First value: ");
        n1 = in.nextDouble();

        System.out.println("Second value: ");
        n2 = in.nextDouble();

        System.out.println("Third value: ");
        n3 = in.nextDouble();

        System.out.println("Fourth value: ");
        n4 = in.nextDouble();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("The smallest value is: " + n1);
        } else if (n2 < n3 && n2 < n4) {
            System.out.println("The smallest value is: " + n2);
        } else if (n3 < n4) {
            System.out.println("The smallest value is: " + n3);
        } else {
            System.out.println("The smallest value is: " + n4);
        }
    }

    private static void Ex10() {

        System.out.println("\n===== Ex 10 =====\n" + "Insert number: ");
        double n1 = in.nextDouble();

        if (n1 % 2 == 1) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number isn't odd.");
        }
    }

    private static void Ex11() {

        double side1, side2, side3;


        System.out.println("\n===== Ex 11 =====\n" + "First side: ");
        side1 = in.nextDouble();

        System.out.println("Second side: ");
        side2 = in.nextDouble();

        System.out.println("Third side: ");
        side3 = in.nextDouble();


        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("\nThe three sides form a triangle.\n");
            if (side1 == side2 && side1 == side3) {
                System.out.println("\nThe triangle is equilateral\n");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("\nThe triangle is isosceles..\n");
            } else System.out.println("\nThe triangle is scalene.\n");
        } else {
            System.out.println("\nThe three sides do not form a triangle!!\n");
        }

    }

    private static void Ex12() {

        System.out.println("\n===== Ex 12 =====\n" + "Product code (001, 002, 003): ");
        int cod = in.nextInt();

        if (cod == 1) {
            System.out.println("001 - Screw");
        } else if (cod == 2) {
            System.out.println("002 - Nut");
        } else if (cod == 3) {
            System.out.println("003 - Nail");
        } else {
            System.out.println("Not defined");
        }
    }

    private static void Ex12String() {

        System.out.println("\n===== Ex 12 =====\n" + "Product code (001, 002, 003): ");
        String cod = in.nextLine();
        //With String, change in.next to Line
        //For if, cod == becomes cod.equals
        if (cod.equals("001")) {
            System.out.println("001 - Screw");
        } else if (cod.equals("002")) {
            System.out.println("002 - Nut");
        } else if (cod.equals("003")) {
            System.out.println("003 - Nail");
        } else {
            System.out.println("Not defined");
        }
    }

    private static void Ex13() {

        System.out.println("\n===== Ex 13 =====\n" + "Product code (001, 002, 003): ");
        int cod = in.nextInt();

        //ENHANCED SWITCH --> LESS CODE
        switch (cod) {
            case 1 -> System.out.println("001 - Screw");
            case 2 -> System.out.println("002 - Nut");
            case 3 -> System.out.println("003 - Nail");
            default -> System.out.println("Not defined");
        }
 /*       switch (cod) {
            case 1:
                System.out.println("001 - Screw");
                break; //break
            case 2:
                System.out.println("002 - Nut");
                break;
            case 3:
                System.out.println("003 - Nail");
                break;
            default:
                System.out.println("Not defined");
                break;
        }*/
    }

    //// Grupo III - Cycles ///

    private static void Ex14() {

        int i = 0;
        double sum = 0, mean, number;

        System.out.println("\n===== Ex 14 =====\n");
        while (i < 50) {
            System.out.println("Input number " + (i + 1) + ":");
            number = in.nextDouble();
            sum += number;
            i++;
        }
        mean = sum / 50;
        System.out.println("The mean is: " + mean);

    }

    private static void Ex15() {

        int i = 0;
        double sum = 0, mean, number;

        System.out.println("\n===== Ex 15 =====\n");
        for (i = 0; i < 50; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            number = in.nextDouble();
            sum += number;
        }

        mean = sum / 50;
        System.out.println("The mean is: " + mean);
    }

    private static void Ex16() {

        int i = 0, N = 5;
        double sum = 0, mean, number;

        System.out.println("\n===== Ex 16 (Replace N accordingly) =====\n");

        for (i = 0; i < N; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            number = in.nextDouble();
            sum += number;
        }

        mean = sum / N;
        System.out.println("The mean is: " + mean);
    }

    private static void Ex17() {

        int i = 0, N = 20;
        double sum = 0, mean, number;

        System.out.println("\n===== Ex 17 (Replace N accordingly) =====\n");

        for (i = 0; i < N; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            number = in.nextDouble();
            sum += number;
        }
        mean = sum / N;
        if (mean > 8) {
            System.out.println("The mean 10");
        } else {
            System.out.println("The mean is " + mean);
        }


    }

    private static void Ex18() {

        int i = 0;
        double sum = 0;
        int amountGreaterThan4 = 0;
        int amountNumbers;
        double mean;

        System.out.println("\n===== Ex 18 =====\n" + "Please enter how many INTEGER numbers will be used:");
        amountNumbers = in.nextInt();

        while (i < amountNumbers) {
            System.out.println("Insert number " + (i+1) + "/" + amountNumbers + ":");
            int number = in.nextInt();
            if (number > 4) {
                sum += number;
                //Same as writing: sum = sum + number
                amountGreaterThan4++;
            }
            i++;
            // Same as: i = i + 1
        }

        mean = sum / amountGreaterThan4;
        System.out.println("The mean of values greater than 4 is:" + mean);
    }

    //// Grupo IV - Variado ///

    private static void Ex19() {

        int hour, minutes, conv1, conv2;

        System.out.println("\n===== Ex 19 =====\n" +  "Hour format: HH-MM\n");
        System.out.println("Input HOUR (HH):");
        hour = in.nextInt();

        System.out.println("Input minutes:");
        minutes = in.nextInt();

        conv1 = hour * 3600;
        conv2 = minutes * 60;

        System.out.println("The input: " + hour + "H:" + minutes + "m corresponds to " + (conv1 + conv2) + " seconds.");


    }

    private static void Ex20() {

        int days, years, weeks, daysToConvert;

        System.out.println(("\n===== Ex 20 =====\n" + "Amount of days to convert:"));
        daysToConvert = in.nextInt();

        // Convert days in years, weeks e days

        years = daysToConvert / 365;
        weeks = (daysToConvert % 365) / 7;
        days = daysToConvert - ((years * 365) + (weeks * 7));

        System.out.println("\nFor " + daysToConvert +" days, the conversion is:\n" + years + " years, \n" + weeks + " weeks, \n" + "e " + days + " days\n");

    }

    private static void Ex21() {


//        1 byte (B) = 8 bits
//        1 kilobyte (KB) = 1.024 bytes
//        1 megabyte (MB) = 1.024 kilobytes


        int B, bits;

        System.out.println("\n===== Ex 21 =====\n" + "Intended bytes conversions into bits:");
        B = in.nextInt();

        bits = 8 * B;

        System.out.println("\nThe conversion of " + B + " bytes (B) in bits is\n" + bits + " bits. \n");

    }

    private static void Ex22() {
//        1 byte (B) = 8 bits
//        1 kilobyte (KB) = 1.024 bytes
//        1 megabyte (MB) = 1.024 kilobytes

        System.out.println("\n===== Ex 22 =====\n" + "How mant Megabytes (MB) to convert into Bytes: ");
        double MB = in.nextInt();

        System.out.println("\n"+ MB + " Megabytes (MB) into Bytes is:\n" + MB * Math.pow(1024, 2) + " Bytes. \n");
    }

    private static void Ex23() {

        System.out.println("\n===== Ex 23 =====\n" + "First number: ");
        int n1 = in.nextInt();

        System.out.println("Second number: ");
        int n2 = in.nextInt();

        // int res = n1 * n2;

        int res = 0;

        for (int i = 0; i < n1; i++) { // n1=4 n2=5            i = 0, 1, 2, 3
            res += n2;                    //                      res = 0, 5, 10, 15, 20
        }


        System.out.println("\nMultiplying " + n1 + " x " + n2 + " = " + res);

    }

    private static void Ex24() {

        System.out.println("\n===== Ex 24 =====\n" + "How many numbers will you input? ");
        int chosenAmount = in.nextInt();

        System.out.println("First number: ");
        int num = in.nextInt();

        int biggestNumber = num;
        int smallestNumber = num;
        int sum = num;

        for (int i = 1; i < chosenAmount; i++) {
            System.out.println("Number " + (i + 1) +":");
            num = in.nextInt();
            sum += num;

            if (num > biggestNumber) {
                biggestNumber = num;
            }
            if (num < smallestNumber) {
                smallestNumber = num;
            }
        }
        System.out.println("The mean is: " + sum / chosenAmount);
        System.out.println("Biggest number is: " + biggestNumber);
        System.out.println("Smallest number is: " + smallestNumber);

    }

    private static void Ex25() {

        System.out.println("\n===== Ex 25 =====\n" + "Chosen Year: ");
        int year = in.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " ins't a leap year");
        }
    }

    private static void Ex26() {

//  Sistem   (10)        (2)
//            0           0
//            1           1
//            2           10
//            3           11
//            4           100
//            5           101
//            6           110
//            7           111
//            8           1000
//            9           1001
//            10          1010
//            11          1011
//            12          1100


        System.out.println("\n===== Ex 26 =====\n" + "Input binary number: ");

        String binaryString = in.nextLine();
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal equivalent: " + decimal);
    }



/////////////////////// Write the intended exercise number ///////////////////////////////////////////

    public static void main(String[] args) {
        Ex26();

    }

}