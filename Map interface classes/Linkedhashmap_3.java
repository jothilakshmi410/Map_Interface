package com.anna.msccs;
import java.util.*;
class Linkedhashmap_3 {
    public static void main(String args[])
    {
        LinkedHashMap<Integer, String> hm
            = new LinkedHashMap<Integer, String>();
  
        // Inserting the Elements
        hm.put(3, "Past");
        hm.put(2, "is");
        hm.put(1, "Past");
  
        for (Map.Entry<Integer, String> mapElement : hm.entrySet()) {
  
            Integer key = mapElement.getKey();
  
            // Finding the value
            String value = mapElement.getValue();
  
            // print the key : value pair
            System.out.println(key + " : " + value);
        }
    }
}