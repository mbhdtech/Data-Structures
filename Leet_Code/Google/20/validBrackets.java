
import java.util.*;

/*
 Question:
 
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 
 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * */

public class Test{
    public static void main(String[] args){
        boolean answer = isValid("({})}");
        System.out.println(answer);
    }
    
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        
        
        for(int i = 0; i < str.length(); i++){
            
            // Add all the opening brackets
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            
            
            //The idea of the logic is, if the string is valid, the amount of pushes you have is equal to the amount of pops
            //Also stacks are good for recency.
            //A problem encountered was the order of AND operators in the if statements.
            //If you check if the stack is empty last, you will get errors.
            else if(str.charAt(i) == ')' && !stack.isEmpty()  && stack.peek() == '('){
                stack.pop();
            }
            
            else if(str.charAt(i) == '}'  && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            
            else if(str.charAt(i) == ']'  && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            
            else return false;
            
        }
        
        return stack.empty();
    }
    
    
    
    
}
