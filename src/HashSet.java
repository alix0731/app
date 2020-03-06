import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        Integer[] things = {3,7,3,-1,2,37,2,15,15};
        List<Integer> list = Arrays.asList(things);
        System.out.printf("%s ", list);

        System.out.println();

        Integer[] things1 = {-5,15,2,-1,7,15,36};
        List<Integer> list1 = Arrays.asList(things1);
        System.out.printf("%s ", list1);


countCommon(list,list1);

    }

    public static void countCommon(List<Integer> x, List<Integer> y)  {

        Set<Integer> uniqueNum = new java.util.HashSet<>();


        for(int i = 0; i<x.size();i++){

            if(y.contains(x.get(i))){
                uniqueNum.add(x.get(i));
            }

        }
        System.out.println(uniqueNum);

    }

}
