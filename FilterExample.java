 import java.util.*;
 import java.util.stream.*;
 public class FilterExample {

     public static void main(String[] args) {
         List<String> names = Arrays.asList("Kunal", "Kashish","Shravi", "Ankit", "Aditi");

         // Using Stream API to filter names starting with 'K'
         List<String> filteredNames = names.stream()
                          .filter(name -> name.startsWith("K"))
                 .collect(Collectors.toList());

         System.out.println(filteredNames);
     }
 }

 
  