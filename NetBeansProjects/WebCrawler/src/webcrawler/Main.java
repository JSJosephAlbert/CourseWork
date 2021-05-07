/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawler;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.select.Elements;

/**
 *
 * @author joseph
 */
public class Main {

    public static int runtime;

    public static void main(String[] args) {
        
        //take input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String input = scanner.nextLine();
        System.out.println("Enter desired runtime: ");
        runtime = scanner.nextInt();
        //runtime = 3;
        //String input = "https://www.time.com";
        try {
            URL url = new URL(input);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL 1");
        }

        //get urls to feed into parser
        ArrayList<String> listOfTraversedURLs;
        listOfTraversedURLs = WebCrawler.crawler(input, runtime);
        int i = 0;
        String url;
        String text = null;
        for (String s : listOfTraversedURLs) {
            url = s;
            System.out.println(url);
            try {
                System.out.println(Parse.wordParse(url));
                text += Parse.wordParse(url);
            }
            catch(java.lang.NullPointerException ex){
                
            }
        }
        
        //sort parsed text
        Parse.writeRepeatedWordOccurences(text);
        
    }

}
