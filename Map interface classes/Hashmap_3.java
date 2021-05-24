package com.anna.msccs;
import java.util.*;  
class Hashmap_3{  
 public static void main(String args[]){  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      hm.put(100,"Hema");    
      hm.put(101,"Vijay");    
      hm.put(102,"Siva");   
      System.out.println("Initial list of elements:");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("Updated list of elements:");  
     hm.replace(102, "Shiny");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("Updated list of elements:");  
     hm.replace(101, "Vijay", "Jency");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }   
     System.out.println("Updated list of elements:");  
     hm.replaceAll((k,v) -> "Jothi");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
 }  
} 