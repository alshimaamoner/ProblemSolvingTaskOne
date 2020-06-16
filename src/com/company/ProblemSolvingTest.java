package com.company;

import java.util.HashMap;
import java.util.Map;

public class ProblemSolvingTest {
    public static void main(String[] args) {
       //[3,2,3]
        int arr[]={3,2,3,4};
        Map<Integer,Integer> duplicateValue=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
           if(duplicateValue.get(arr[i])!=null)
                 duplicateValue.put(arr[i],duplicateValue.get(arr[i])+1);
            else
                duplicateValue.put(arr[i],1);

       }
       duplicateValue.forEach((k,i)-> System.out.println("Key is :" +k +", value is : "+i));
    }
}
