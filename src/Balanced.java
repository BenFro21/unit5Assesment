import java.util.Stack;

public class Balanced {

    //step 1
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    //Step 2
    public static boolean isBalanced2(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), c)) {
                    return false;  // Unmatched closing bracket
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();  // Return true if stack is empty (all brackets matched)
    }

    private static boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[' || c == '<';
    }

    private static boolean isCloseBracket(char c) {
        return c == ')' || c == '}' || c == ']' || c == '>';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '<' && close == '>');
    }

    //part 2 step 3
//If you cannot use any built-in Java libraries to implement a stack, you can create a custom stack class from scratch.
// I am still confused on this part. Is it possible or no? the reserch i found seemed to say no
// Adding this before the power goes out
}
