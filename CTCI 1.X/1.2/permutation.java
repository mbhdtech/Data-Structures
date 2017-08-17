
public class permutation {
    public static void main(String[]args){
        String word1 = "foobar";
        String word2 = "rabofo";

            boolean answer = permutation(word1, word2);
            System.out.print(answer);
        }

        public static boolean permutation(String str1, String str2){
            if(str1.length() != str2.length()){
                 return false;
            }

            else{
                char[] word1 = str1.toCharArray();
                char[] word2 = str2.toCharArray();

                java.util.Arrays.sort(word1);
                java.util.Arrays.sort(word2);

                str1 = new String(word1);
                str2 = new String(word2);

                    if(str1.equals(str2)){
                        return true;
                    }
                    else{
                        return false;
                    }
        }

    }
}


