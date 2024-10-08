package DataStructuresImplementation.Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String myString){
        // Checking the Edge case If String Empty or String is Null.
        if(myString == null || myString.isEmpty()){  // myString.length() == 0 -> myString.!isEmpty()
            return false;
        }

        Stack<Character> characterStack = new Stack<>();  // Create a Stack to track of opening brackets.

        //  Iterate through each character in the input String
        for(char c : myString.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                characterStack.push(c);  // Pushing opening brackets --> if it is an opening bracket, push it into the stack.
            } else {
                if(characterStack.isEmpty()) return false;

                char open = characterStack.pop();  // pop the last opening bracket from the stack.
                if(c ==  ')' &&  open != '(') return false;  // Check if the popped bracket matches the closing bracket.
                if(c ==  '}' &&  open != '{') return false;
                if(c ==  ']' &&  open != '[') return false;
            }
        }
        return characterStack.isEmpty();

    }    public static void main(String[] args) {
         ValidParentheses validParentheses =new ValidParentheses();
        String myString = "(){}";
        boolean res = validParentheses.isValid(myString);
        System.out.println(res);
    }
}
