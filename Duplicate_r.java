//package com.sangamone;

import java.util.*;
public class Duplicate_r{

    public static void main(String [] args){
    System.out.println(Orginal());



    }
    public static List Orginal(){
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1.add(12);
        list1.add(2);
        list1.add(5);
        list1.add(12);
        list1.add(6);
        list1.add(5);
        list2.addAll(list1);
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list2.size();j++){
                if(list2.get(i)==list2.get(j)){
                    list2.remove(j);
                }
            }
        }
        return list2;

    }
}