package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("amol");
        list.add("ajay");
        list.add("jadhav");

        // 1️⃣ Count how many names start with 'a'
        long count = list.stream()
                         .filter(name -> name.startsWith("a"))
                         .count();
        System.out.println(count);  // Output: 2 (amol, ajay)
                          List<String> result = list.stream()
                                  .filter(name -> name.length() > 3)
                                  .map(String::toUpperCase)
                                  .sorted()
                                  .collect(Collectors.toList());

        for (String string : result) {
            System.out.println(string);
        }

    }
}
