package main.java.com.techhub;

import java.util.*;

public class CollectionDemo {

    public void run(){
        ArrayListDemo();
       // SetDemo();

       // MapDemo();
    }

    public  void ArrayListDemo(){

        ArrayList<Integer> results = new ArrayList<>(5);
        results.add(55);
        results.add(60);
        results.add(70);
        results.add(80);
        results.add(45);
        results.add(77);

        System.out.printf("Size=%d  \n", results.size());
        System.out.printf("Element at 3 pos = %d", results.get(2));
        for (int result : results){
            System.out.printf("%d ", result);
        }

        Iterator<Integer> resultIterator = results.iterator();

        while(resultIterator.hasNext()){
            System.out.println(resultIterator.next());
        }

    }

    public void SetDemo(){
        TreeSet<Integer> ages = new TreeSet<>();

        ages.add(11);
        ages.add(24);
        ages.add(16);
        ages.add(16);
        ages.add(18);
        ages.add(20);
        ages.add(20);
        ages.add(11);
        ages.add(9);
        ages.add(21);
        ages.add(22);


        System.out.println(ages);


    }

    public  void MapDemo(){
        HashMap<String, Integer> results = new HashMap<>();

        results.put("James",55);
        results.put("King",67);
        results.put("Wale",88);

        System.out.printf("Student  %s = %d \n", "James",results.get("James"));

        for( String key : results.keySet()){
            System.out.printf("Student  %s = %d \n", key,results.get(key));
        }
    }
}
