package com.anna.msccs;
import java.util.*;  
public class Hash_map{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();  
   map.put(1,"Karthik");   
   map.put(2,"Swepna");    
   map.put(3,"Hema");   
   map.put(4,"Rudhra");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  