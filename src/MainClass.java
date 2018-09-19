import java.security.Key;
import java.util.*;

public class MainClass {

    /*Example of computeIfAbsent method.

      If Animal (Key) like dog, cat is already there add the breed to the animal list.
      If Animal is not available is not there then create hashmap with the key and then add breed to the list.

     */
    public static void main(String[] args)
    {

        ArrayList<String>  llist=new ArrayList<String>(); //Creating arraylist


        Map<String,List<String>> AnimalBreed = new HashMap<>();

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("bulldog");

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("atlassian");

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("pitbull");

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("dalmatian");

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("german shepherd");

        AnimalBreed.computeIfAbsent("Dog",key -> new ArrayList<>()).add("japanese Chin");

        AnimalBreed.computeIfAbsent("Cat",key -> new ArrayList<>()).add("bengal Cats");

        System.out.println("AnimalBreed: " + AnimalBreed);

        System.out.println("Dogs Breed: " + AnimalBreed.get("Dog"));

        System.out.println("Cats Breed "+AnimalBreed.get("Cat"));

        for (List<String> value : AnimalBreed.values()) {

            /* Checking Value Existence

            if (value.contains("Bulldog")) { // change the 1 to whatever value you're searching

            */


            for(String el : value)
            {
                // Converting value to uppercase so it can be sorted

                llist.add(el.toUpperCase());

            }

        }

        System.out.println("Not Sorted One "+llist);


        Collections.sort(llist);

        System.out.println("Sorted One "+llist);



    }











    }

