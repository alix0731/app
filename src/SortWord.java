import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWord {


    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("abekat");
        words.add("musefælde");
        words.add("ananas");
        words.add("slut");
        words.add("solskin");

        System.out.println(words);


        sortAllWords(words);


    }

    public static void sortAllWords(List<String> x){

        List<String> words1 = new ArrayList<>();

        Collections.sort(x);

        for(int i = (x.size()-1); i>=0; i--){
            words1.add(x.get(i));
        }
        System.out.println(words1);
    }
}
