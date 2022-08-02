package org.chapter3AND4;

import java.util.*;


public class TeamShuffler {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("iModupsy");
        nameList.add("Chijioke");
        nameList.add("David");
        nameList.add("Taofiq");
        nameList.add("Marynoir");
        nameList.add("Eze");
        nameList.add("Chinedu");
        pick(nameList);
    }

    public static void pick(List<String> nameList) {
        Collections.shuffle(nameList);

        for (int i = 0; i < nameList.size() - 1 ; i++) {
            if (i == 0 && nameList.size() % 2 != 0) {
                String[] namePair = {nameList.get(0), nameList.get(1), nameList.get(2)};
                System.out.println(Arrays.toString(namePair));
                i = 3;
            }
            String[] namePair = {nameList.get(i), nameList.get(i += 1)};
            System.out.println(Arrays.toString(namePair));
        }
    }


}