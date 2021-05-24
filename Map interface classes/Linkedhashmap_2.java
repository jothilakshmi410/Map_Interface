package com.anna.msccs;
import java.util.*;

class Linkedhashmap_2 {
    public static void main(String args[])
    {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm
            = new LinkedHashMap<Integer, String>();
  
        // Inserting the Elements
        // using put() method
        hm.put(3, "Past");
        hm.put(2, "Past");
        hm.put(1, "Past");
        hm.put(4, "is");
  
        // print the mappings to the console
        System.out.println("Initial Map : " + hm);
  
        // Remove the mapping with Key 4
        hm.remove(4);

        // print the updated map
        System.out.println("Updated Map : " + hm);
    }
}