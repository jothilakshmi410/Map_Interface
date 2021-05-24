package com.anna.msccs;
import java.util.*;  
public class Treemap_1{  
   public static void main(String args[]) {  
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Hema");    
      map.put(102,"Sanjay");    
      map.put(101,"Jothi");    
      map.put(103,"Siva");    
      System.out.println("Before invoking remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      map.remove(102);      
      System.out.println("After invoking remove() method");  
      for(Map.Entry m:map.entrySet())  
      {  
          System.out.println(m.getKey()+" "+m.getValue());      
      }  
      }  
}  