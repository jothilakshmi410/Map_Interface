package com.anna.msccs;
import java.util.*;  
public class Hashmap_2 {  
   public static void main(String args[]) {  
    HashMap<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Mala");    
      map.put(101,"Jothi");    
      map.put(102,"Velmani");  
      map.put(103, "Guru");  
    System.out.println("Initial list of elements: "+map);  
    //key-based removal  
    map.remove(100);  
    System.out.println("Updated list of elements: "+map);  
    //value-based removal  
    map.remove(101);  
    System.out.println("Updated list of elements: "+map);  
    //key-value pair based removal  
    map.remove(102, "Velmani");  
    System.out.println("Updated list of elements: "+map);  
   }      
}  