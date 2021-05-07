/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseph
 */
public class Parse {

    public static String text;
    public static int[] count = new int[50];
    private static ArrayList stopWordList = new ArrayList<String>();
    
    public static String wordParse(String input) {
        try {
            URL url = new URL(input);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL 2");
        }
        
        //parses for user readable text
        Document doc = null;
        try {
            doc = Jsoup.connect(input).get();
        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
        text = doc.body().text();
        text.toLowerCase();
        String[] textArray = text.split(" " + ",");
        text = Arrays.toString(textArray);
        return text;
    }

    /*
    public static void wordCount() {
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        ArrayList<String> wordList = new ArrayList<String>();

        for (String words : text.split("\\ ")) {
            words.toUpperCase();
            wordList.add(words);
            //System.out.println(words);
        }
    }
    */

    /*
    public static Elements linkParse(String input) {
        try {
            URL url = new URL(input);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL 2");
        }
        Document doc = null;
        try {
            doc = Jsoup.connect(input).get();
        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
        Elements links = doc.select("a[href]");
        return links;
    }
    */

    //i found this online somewhere and modified it, but i don't remember where
    //i got it
    public static void writeRepeatedWordOccurences(
            String strContent){
        String file = "output.txt";
        PrintWriter write = null;
        try {
           write = new PrintWriter(new FileWriter(file, true));
        } catch (IOException ex) {
            Logger.getLogger(Parse.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Step 1: create Map of String-Integer
        HashMap<String, Integer> mapOfRepeatedWord
                = new HashMap<String, Integer>();

        // Step 2: split line using space as delimiter
        String[] words = strContent.split(" ");

        // Step 3: iterate through String[] array
        for (String word : words) {

            // Step 4: convert all String into lower case, 
            // before comparison
            String tempUCword = word.toLowerCase();
            
            tempUCword.split("\\d");
            if(tempUCword.contains("\\D")){
                continue;
            }
            
            stopWordList.add("the");
            stopWordList.add("to");
            stopWordList.add("of");
            stopWordList.add("and");
            stopWordList.add("a");
            stopWordList.add("in");
            stopWordList.add("on");
            stopWordList.add("at");
            stopWordList.add("for");
            stopWordList.add("it");
            stopWordList.add("be");
            stopWordList.add("is");
            stopWordList.add("this");
            stopWordList.add("by");
            stopWordList.add("with");
            stopWordList.add("as");
            stopWordList.add("{");
            stopWordList.add("}");
            stopWordList.add(".");
            stopWordList.add(",");
            stopWordList.add("(");
            stopWordList.add(")");
            stopWordList.add("»");
            stopWordList.add("{*");
            stopWordList.add("*}");
            stopWordList.add("{|");
            stopWordList.add("|}");
            if(stopWordList.contains(tempUCword)){
                continue;
                
            }
            

            // Step 5: check whether Map contains particular word 
            if (mapOfRepeatedWord.containsKey(tempUCword)) {

                // Step 6: If contains, increase count value by 1
                mapOfRepeatedWord.put(tempUCword,
                        mapOfRepeatedWord.get(tempUCword) + 1);
            } else {

                // Step 7: otherwise, make a new entry
                mapOfRepeatedWord.put(tempUCword, 1);
            }
        }

        // Step 9: Sorting logic by invoking sortByCountValue()
        HashMap<String, Integer> wordLHMap = sortByCountValue(
                mapOfRepeatedWord);

        write.println("\n\nAfter sorting"
                + " in descending order of count : \n");
        write.println("Words" + "\t\t" + "Count");
        write.println("======" + "\t\t" + "=====");

        // Step 10: Again print after sorting
        int count = 1;
        for (HashMap.Entry<String, Integer> entry
                : wordLHMap.entrySet()) {
            if(count <= 50) {
                write.println(count + " " + entry.getKey()
                        + "\t\t" + entry.getValue());
            }
            count++;
        }
        write.close();
    }

    /**
     * this method sort acc. to count value
     *
     * @param mapOfRepeatedWord
     * @return
     */
    public static HashMap<String, Integer> sortByCountValue(
           HashMap<String, Integer> mapOfRepeatedWord) {

        // get entrySet from HashMap object
        Set<HashMap.Entry<String, Integer>> setOfWordEntries
                = mapOfRepeatedWord.entrySet();

        // convert HashMap to List of Map entries
        ArrayList<HashMap.Entry<String, Integer>> listOfwordEntry
                = new ArrayList<HashMap.Entry<String, Integer>>(
                        setOfWordEntries);

        // sort list of entries using Collections.sort(ls, cmptr);
        Collections.sort(listOfwordEntry,
                new Comparator<HashMap.Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> es1,
                    Entry<String, Integer> es2) {
                return es2.getValue().compareTo(es1.getValue());
            }
        });

        // store into LinkedHashMap for maintaining insertion
        HashMap<String, Integer> wordLHMap
                = new LinkedHashMap<String, Integer>();

        // iterating list and storing in LinkedHahsMap
        for (HashMap.Entry<String, Integer> map : listOfwordEntry) {
            wordLHMap.put(map.getKey(), map.getValue());
        }

        return wordLHMap;
    }

}
