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
 public class FilterExample {

 public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(5,10,15,20,25);
    
        // Using Stream API to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                           .filter(n -> n % 2 == 0)
                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
 }
 }