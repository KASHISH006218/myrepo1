import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunnableTraditional {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("kunal");
        list.add("kashish");
        list.add("shravi");

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println(list);
    }
}
