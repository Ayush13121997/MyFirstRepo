package in.Learning.SplitItreator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Spliterator<Integer> spliterator = numbers.spliterator();
        
        // Print the characteristics of the spliterator
        System.out.println("Characteristics of the spliterator:");
        System.out.println("Estimated Size: " + spliterator.estimateSize());
        
        System.out.println("Characteristics: " + spliterator.characteristics());
        
        // Try to advance and print each element
        System.out.println("Using tryAdvance:");
        spliterator.tryAdvance(System.out::println); // Prints the first element
        spliterator.forEachRemaining(System.out::println); // Prints the remaining elements
        
        // Reset the spliterator
        spliterator = numbers.spliterator();
        
        // Splitting the spliterator
        Spliterator<Integer> split = spliterator.trySplit();
        
        System.out.println("\nUsing split:");
        if (split != null) {
            split.forEachRemaining(System.out::println); // Prints elements from the split
        }
        
        System.out.println("Remaining elements:");
        spliterator.forEachRemaining(System.out::println); // Prints remaining elements
    }
}
