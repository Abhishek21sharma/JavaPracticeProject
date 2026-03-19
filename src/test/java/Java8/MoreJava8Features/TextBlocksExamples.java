package Java8.MoreJava8Features;

public class TextBlocksExamples {

    public static void main(String[] args) {
        //this feature was released with java 15
        //to work better with stings. or a block of strings.
        
        //so to add up special characters and insert text in it..

        //multi line string..
        String s1 = "dkdkd" +
                "wfjwnffw" +
                "wdfllkwfkl" +
                "wlfjwl";


        //it's released in java 15+
        //use triple quote to use this feature...
        String s2 = """
                This is a valid 
                multiline string
                no need to add + 
                or even /n etc..
                """;

        String json = """
                {
                "order_id": 123456,
                "status": "DELIVERED
                }
                """;

        //adding dynamic text/string etc in the textbox -> triple quotes#
        String name = "firstname lastname";
        String multiline = """
                hello , %s!
                how are doing today! 
                """.formatted(name);

        System.out.println(json);
    }
}
