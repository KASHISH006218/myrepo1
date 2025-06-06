//  import java.util.*;
//  import java.util.stream.*;
//  public class FilterExample {

//      public static void main(String[] args) {
//          List<String> names = Arrays.asList("Kunal", "Kashish","Shravi", "Ankit", "Aditi");

//          // Using Stream API to filter names starting with 'K'
//          List<String> filteredNames = names.stream()
//                           .filter(name -> name.startsWith("K"))
//                  .collect(Collectors.toList());

//          System.out.println(filteredNames);
//      }
//  }
import java.util.*;
 import java.util.stream.*;
 public class MaxFilterExample {

     public static void main(String[] args) {
        List Integer> numbers = Arrays.asList(5,10,15,20,25);

         // Using Stream API to filter even numbers and find the maximum
         Optional<Integer> maxEvenNumber = numbers.stream()
                           .filter(num -> num % 2 == 0)
                           .max(Integer::compareTo);

         // Print the maximum even number if present
         maxEvenNumber.ifPresent(System.out::println);
     }
 }
         

