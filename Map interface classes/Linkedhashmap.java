package com.anna.msccs;
import java.util.*;  
class Linkedhashmap{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"Siva");  
  hm.put(101,"Vijay");  
  hm.put(102,"Priya");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  