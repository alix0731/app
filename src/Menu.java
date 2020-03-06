import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        Scanner scan;

        while (true) {

            scan = new Scanner(System.in);

            System.out.println("1.Beregn");
            System.out.println("2.Udskriv");
            System.out.println("3.Hjælp");
            System.out.println("0.Exit");
            System.out.print("Type a number from the menu? ");


            try {

                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println(1);
                }
                if (input == 2) {
                    System.out.println(2);
                }
                if (input == 3) {
                    System.out.println(3);
                }
                if (input == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("try again please...");
            }

        }


    }
}
