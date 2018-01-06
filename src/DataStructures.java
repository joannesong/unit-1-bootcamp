import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main (String args[]) {

        Map<String, Integer> podHashMap = new HashMap<>();
        podHashMap.put("Joanne", 25);
        podHashMap.put("Ashley", 26);
        podHashMap.put("Siran", 2);
        podHashMap.put("Amar", 3);
        podHashMap.put("Muhaimen", 4);
        podHashMap.put("Niema", 5);
        for (int i = 0; i < podHashMap.size(); i++) {
            System.out.println(podHashMap.get(i));
        }


        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(3);
        myList.add(4);

        mostFrequentElement((ArrayList<Integer>) myList);

        Cat cat1 = new Cat();
        Person person1 = new Person();
        person1.setName("Barbara");
        cat1.setName("Annie");
        cat1.setOwner(person1);
        cat1.setFavoriteFood("Sushi");
        cat1.setAge(7);

        Cat cat2 = new Cat();
        Person person2 = new Person();
        person2.setName("Carol");
        cat2.setName("Kristen");
        cat2.setOwner(person2);
        cat1.setFavoriteFood("Carrots");
        cat2.setAge(5);

        Cat cat3 = new Cat();
        Person person3 = new Person();
        person3.setName("Diane");
        cat3.setName("Jenny");
        cat3.setOwner(person3);
        cat1.setFavoriteFood("Peanut Butter");
        cat3.setAge(12);

        Cat cat4 = new Cat();
        Person person4 = new Person();
        person4.setName("Finn");
        cat4.setName("Indigo");
        cat4.setOwner(person4);
        cat1.setFavoriteFood("Pizza");
        cat4.setAge(3);

        Cat cat5 = new Cat();
        Person person5 = new Person();
        person5.setName("George");
        cat5.setName("Harvey");
        cat5.setOwner(person5);
        cat5.setFavoriteFood("Apples");
        cat5.setAge(2);


        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);


        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i));
        }
    }
    public static void mostFrequentElement(ArrayList<Integer> intArr){
        int count = 1, tempCount;
        int popular = intArr.get(0);
        int temp = 0;
        for (int i = 0; i < (intArr.size() - 1); i++)
        {
            temp = intArr.get(i);
            tempCount = 0;
            for (int j = 1; j < intArr.size(); j++)
            {
                if (temp == intArr.get(j))
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println(popular);
    }

    public boolean canRentCar(HashMap<String, Integer> podHashMap){

        boolean over25 = false;

        for(Integer integer : podHashMap.values()){
            if(integer > 25){
               over25 = true;
            }
        }
        return over25;
    }
    public ArrayList<String> wordsWithoutList(ArrayList<String> strList, int num){
        for (int i = 0; i < strList.size(); i++) {
            if(strList.get(i).length() == num){
                strList.remove(i);
            }
        }
        return strList;
    }
    public void sortingSentences(String sentence){
        List<String> listInAlphabeticalOrder = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {

        }
    }
}

//        ```
//
//        ####6. How many clumps?
//
//        Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of the same value. Write a method that returns the number of clumps in the given ArrayList.
//
//        ```
//        countClumps({1, 2, 2, 3, 4, 4}) → 2
//        countClumps({1, 1, 2, 1, 1}) → 2
//        countClumps({1, 1, 1, 1, 1}) → 1
//        ```
//
//        ####7. Sorting sentences
//
//        Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element), and prints out the words in alphabetical order.
