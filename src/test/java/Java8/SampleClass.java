package Java8;

public class SampleClass {
    public static void main(String[] args) {
        //difference between == and .equals()


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

// s1 and s2 point to the same literal in the String Pool
        System.out.println(s1 == s2);      // true

// s3 is a new object on the heap, different memory address
        System.out.println(s1 == s3);      // false

// The content of s1 and s3 are identical
        System.out.println(s1.equals(s3)); // true
    }
}
