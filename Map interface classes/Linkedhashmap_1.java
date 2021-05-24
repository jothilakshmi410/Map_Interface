package com.anna.msccs;
import java.util.*;

class Linkedhashmap_1 {
  
    public static void main(String args[])
    {
        LinkedHashMap<Integer, String> hm1
            = new LinkedHashMap<Integer, String>();
        hm1.put(3, "past");
        hm1.put(2, "is");
        hm1.put(1, "past");
  
        // print mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                           + hm1);
    }
}