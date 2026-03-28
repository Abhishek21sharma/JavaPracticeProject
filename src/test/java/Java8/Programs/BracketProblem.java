package Java8.Programs;

import java.util.Stack;

public class BracketProblem {
    //ranked easy,..
    //valid parenthesis

    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //An input string is valid if:
    //
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.

    //Example 2:
    //
    //Input: s = "()[]{}"
    //
    //Output: true##

    //Example 3:
    //
    //Input: s = "(]"
    //
    //Output: false

    //Example 4:
    //
    //Input: s = "([])"
    //
    //Output: true
    //
    //Example 5:
    //
    //Input: s = "([)]"
    //
    //Output: false



    public static void main(String[] args) {
        String s = "([])";     //true
        String s1 = "([)]";   //false
        String s3 = "(){}[]"; //true

        result(s);

    }

    public static boolean result(String s) {
        boolean flag = false;

        //if a bracket is opened ..
        //check the next string .. that should be closed
        //if that is another brakced

        //hmm if brancket is opened , add it to 'set'..
        //if another opened add it to 'set' too..
        //if next one is another type of bracket //


        //It's classic STACK problem...

        //first of all the strings chars has to be even ..

        //so idea here is similar to set approach
        //but set will not work in this case, because set keeps tracks of
        //every item , not just the last item inserted to it..
        //so best approach is STACK..

        if (s.length() % 2 != 0)
            return flag;

        Stack<Character> stack = new Stack<>();
        for (char c :
                s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            }
        }

        flag = stack.empty();
        return flag;

    }

}
