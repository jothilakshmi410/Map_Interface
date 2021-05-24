package com.anna.msccs;
import java.util.*;  
class Treemap{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Hema");    
      map.put(102,"Jothi");    
      map.put(101,"Sanjay");    
      map.put(103,"Siva");    
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  