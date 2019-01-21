package com.bigId;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String text = "nivkfjgfdnglfdngBenfk fkfgil fjklng ben fkldbenivgilfgln gjben pfeopf";
        String word = "ben";
        List<String> words = Arrays.asList("ben", "gil", "niv");

        Matcher matcher = new Matcher();



        System.out.println("start");
        Map<String, List<Integer>> indexes = matcher.findWords(text, words);
        System.out.println("done");
    }





}
