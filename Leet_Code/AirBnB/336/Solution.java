import java.lang.reflect.Array;
import java.util.ArrayList;
public class Solution{
    public static void main(String[] args){

        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
        ArrayList<ArrayList<Integer>> answer = palindromePairs(words);
        for(ArrayList<Integer> x : answer){
            System.out.print(x);
        }
    }

    public static ArrayList<ArrayList<Integer>> palindromePairs(String[] words) {
        ArrayList<ArrayList<Integer>> listOfindices = new ArrayList<>();
        boolean answer;
        for(int i = 0; i < words.length; i++){
            for(int j = 0 ; j < words.length; j++){
                answer = isPalindrome(words[i] + words[j]);
                if(words[i] == words[j]){
                    answer = false;
                }
                if (answer==true){
                    ArrayList<Integer> indices = new ArrayList<>();
                    indices.add(i);
                    indices.add(j);
                    listOfindices.add(indices);
                }

            }
        }
        return listOfindices;
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < (n/2); ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
            return true;
    }

}