/**
 * Created by matthewbrandon on 10/19/17.
 */

import java.util.*;
import java.util.Map.Entry;
public class Solution {

    public static void main(String[] args){
        String url;
        Scanner keyboard = new Scanner(System.in);
        HashMap<String, String> urlMap = new HashMap<>();
        HashSet<String> urlSet = new HashSet<>();
        do {
            System.out.println("Please enter your URL here please");
            System.out.println("if you wish to stop shrinking URL, enter the number '-1' :");
            url = keyboard.nextLine();
            if (url.equals("-1")) {
                break;
            }

            codeGenerator(url, urlMap, urlSet);

        }
            while(!url.equals("-1")) ;

        System.out.println("Here is a list of URLs you have shortened");

        //Enhanced for loop
        Set<Entry<String, String>> hash = urlMap.entrySet();
        for(Entry entry : hash){
            System.out.println("URL: " + entry.getKey() + " TinyURL: " + entry.getValue());
        }

    }



    public static String codeGenerator(String u, HashMap<String, String> map, HashSet<String> set){
        int case1; // 0 - 9
        int length = 0;
        Random rand = new Random();
        String tinyURL = "https://tinyurl.com/";

        char[] array = new char[6];
        String code;



        while(length < 6) {
            case1 =(int)(Math.random()*3 + 1);
            case1 = rand.nextInt((3-1) + 1) + 1;

            // 0 - 9
            if (case1 == 1) {
                int random =(int)(Math.random() * 57 + 48);
                random = rand.nextInt((57 - 48) + 1) + 48;
                array[length] = (char)random;
            }
            // a - z
            if (case1 == 2) {
                int random =(int)(Math.random() * 122 + 97);
                random = rand.nextInt((122 - 97) + 1) + 97;
                array[length] = (char)random;
            }

            // A - Z
            if (case1 == 3) {
                int random =(int)(Math.random() * 90 + 65);
                random = rand.nextInt((90 - 65) + 1) + 65;
                array[length] = (char)random;
            }

            length++;

        }

        code = String.valueOf(array);


        if(set.contains(u)){
            return tinyURL + map.get(code);
        }

        map.put(tinyURL+code, u);
        set.add(u);
        
        return tinyURL + code;
    }

 }




