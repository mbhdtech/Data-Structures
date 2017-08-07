
public class isUnique {
    public static void main(String[]args){
    String word = "Pleas";
    boolean answer = check(word);
    System.out.print(answer);
    }

    public static boolean check(String str){

        boolean charArray[] = new boolean[127];

        for(int i = 0; i < str.length(); i++ ){
            int value = str.charAt(i);

            if(charArray[value]){
                return false;
            }

            charArray[value] = true;

        }
        return true;
    }
}
