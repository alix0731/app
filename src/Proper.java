public class Proper {


    public static void main(String[] args) {

regning(30,53);


    }

    public static void regning(int num1, int num2) {

        if (num1 <=50 && num2 <=50) {

            System.out.println("plus: " + (num1 + num2));
            System.out.println("minus: " + (num1-num2));
            System.out.println("multiplikation: " + (num1 * num2));
            System.out.println("Division: " + ((double) num1/(double) num2));


        }
        else{
            throw new IllegalArgumentException("High number");
        }



    }

}
