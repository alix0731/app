import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("go");
        list1.add("ho");
        list1.add("bo");
        list1.add("eo");

        System.out.println(chechIfIn(list1,"vo"));



    }

    public static boolean chechIfIn(List<String> l1, String x) {

        if (x == null){
            return false;
        }

        for (int i = 0; i < l1.size(); i++) {

            if(l1.get(i).equals(x)){
                return false;
            }

        }
        l1.add(x);

        return true;
    }

}



