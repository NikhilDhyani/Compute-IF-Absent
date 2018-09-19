import java.security.Key;
import java.util.*;

public class MainClass {

    /*Example of computeIfAbsent method.

      If Animal (Key) like dog, cat is already there add the breed to the animal list.
      If Animal is not available is not there then create hashmap with the key and then add breed to the list.

     */
    public static void main(String[] args)
    {


        Map<String,List<String>> AnimalBreed = new HashMap<>();

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("Bulldog");

        System.out.println("AnimalBreed: " + AnimalBreed);


        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("Dalmatian");

        System.out.println("AnimalBreed: " + AnimalBreed);


        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("Japanese Chin");

        System.out.println("AnimalBreed: " + AnimalBreed);

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("Japanese Chin");

        System.out.println("AnimalBreed: " + AnimalBreed);





        AnimalBreed.computeIfAbsent("Cat",key -> new ArrayList<>()).add("Bengal Cats");


        System.out.println("AnimalBreed: " + AnimalBreed);

        System.out.println("Dog Breed: " + AnimalBreed.get("Dog"));


        // Checking Value Existence

        for (List<String> value : AnimalBreed.values()) {
            if (value.contains("Bulldog")) { // change the 1 to whatever value you're searching
                System.out.println("Found!");
            }
        }











    }
}
