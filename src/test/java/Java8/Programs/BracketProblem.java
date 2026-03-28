package Java8.Programs;

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


    }

    public static boolean result(String s){
        boolean flag = false;

        char[] c = s.toCharArray();

        //if a bracket is opened ..
        //check the next string .. that should be closed
        //if that is another brakced

        //hmm if brancket is opened , add it to 'set'..
        //if another opened add it to 'set' too..
        //if next one is another type of bracket //


        return flag;
    }
}
