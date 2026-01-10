package Java8.Programs;

import java.sql.SQLOutput;

public class Regex {

    public static void main(String[] args) {

        String s = "aaio20mmpIOMAA377*()ffAxx";

        System.out.println("--original string-- ");
        System.out.println(s);

        //remove math characters
        //System.out.println(s.replaceAll("[0-9]",""));

        //do not remove math characters
        //System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));

        //join two conditions
        //System.out.println(s.replaceAll("[[a-zA-Z]|[0-9]]",""));

        System.out.println("removing special characters: "+ s.replaceAll("[^[a-zA-z][0-9]]",""));




    }
}
