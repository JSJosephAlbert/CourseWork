package webcrawler;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class WebCrawler{

    public String words;
    
    public static void main(String[] args) {
    /*    
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a URL: ");
    String url = input.nextLine(); 
    crawler(url); // Traverse the Web from the a starting url
    */    
    }

    public static ArrayList crawler(String startingURL, int runtime) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        
        //gets current time and compares to user input runtime
        long starttime = System.currentTimeMillis();
        long start = System.currentTimeMillis();
        long endtime = start + runtime * 1000;
        while (start < endtime) {
            start = System.currentTimeMillis();
            
            
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
            
        }
        System.out.println("Done Crawling");
        long elapsedTime = endtime - starttime;
        System.out.println(TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS));
        return listOfTraversedURLs;
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
