public class Kvadrat {

    public static void main(String[] args) {


       pattern(6);

    }

    public static void pattern(int tal){

        for(int i = 1; i<=tal; i++){

            for (int j = 1; j<=tal;j++){
                System.out.print("* ");
            }

            System.out.println("* ");



        }

    }
}
