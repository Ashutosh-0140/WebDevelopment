import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class StreamIntermediateOperationExample{
    public static void main(String args[]){
        List<List<String>> listOfLists = Arrays.asList(
             Arrays.asList("Sam", "Sita", "Sohan"),
            Arrays.asList("Anita", "Arjun", "Amar"),
            Arrays.asList("Suresh", "Sunita", "Sanjay")


        ); 
        //create a set to hold intermediate results
        Set<String> intermediateResult = new HashSet<>();

        // Perform cvarious Intermediate operations
        List<String> result = listOfLists.stream()
        .flatMap(List::stream)
        .filter(s -> s.startsWith("A"))
        .map(String::toUpperCase)
        .distinct()
        .sorted()
        .peek(s -> intermediateResult.add(s))
        .collect(Collectors.toList());

        //print final result after stream
        System.out.println("Intermediate Result:");
        result.forEach(System.out::println);
    }
}