
package edu.ru.lab10;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.IntStream;


public class MainClass {

  
    public static void main(String[] args) 
    {
        ArrayList<Integer> myArrayList = new ArrayList();
        HashMap<Integer, Integer> myHashmap = new HashMap();
        //Bonus Point
       // ArrayList<Integer> myArray = new ArrayList();
        Set<Integer> myHashSet = new HashSet<Integer>();
        int myArray[] = new int[1000000];
        
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt();
        
        for(int i=0; i<1000000; i++){
            myArrayList.add(randomNumber);
            myHashmap.put(randomNumber, i);
            myHashSet.add(randomNumber);
            myArray[i]=randomNumber;
            
            randomNumber = randomizer.nextInt();
           
        }
        
        int n = 5;
        
        long start = System.nanoTime();
        myArrayList.contains(n);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Array List lookup took: " + duration + " nano second.");
        
        start = System.nanoTime();
        myHashmap.containsKey(n);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Hashmap lookup took: " + duration + " nano second.");
        
        start = System.nanoTime();
        myHashSet.contains(n);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Set lookup took: " + duration + " nano second.");
        
        start = System.nanoTime();
        IntStream.of(myArray).anyMatch(s -> s == n);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Array lookup took: " + duration + " nano second.");
        
          start = System.nanoTime();
          for (int num : myArray) {
              if (num == n) {
                  break;
                  }
                }
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Array lookup took: " + duration + " nano second.");
    }
    
}
