import java.util.Scanner;

public class Grass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("hvor langt er græsset lige nu i cm?: ");
        double lang = scan.nextDouble();
        // double lang = 2.0;
        System.out.print("Hvor langt skal det være før det skal klippes?: ");
        double when = scan.nextDouble();
        //double whenToCut = 12.0;

        System.out.println("Det skal " + days(lang, when)+ " dage til at slå græsset næste gang");

// vokser 0.8 cm om dagen

    }

    public static double days(double lang, double when) {

        int days = 0;
        double inc = 0.8;

        while (true) {

            if(lang<when){
                lang = lang + inc;
                days++;
                if(lang > when){
                    break;
                }

            }

        }
return days;
    }

}
