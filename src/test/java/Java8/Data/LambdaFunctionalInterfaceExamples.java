package Java8.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFunctionalInterfaceExamples {

    public static void main(String[] args) {

        //If ew want to use Interface we have to implement it and a class has to be used with 'new' to use any method
        //but but if it's just a single method in interface so that can be called something like this as well

        //usual way

        //InterfaceA interfaceA = new ImplementedClass()
        //interfaceA.test();

        //since it's a single method in an interface this can be used like this
        InterfaceABZ interfaceA = new InterfaceABZ() {
            @Override
            public void test() {
                System.out.println("test method");
            }
        };

        //the lambda style , this above can be converted to:
        InterfaceABZ interfaceABZ = () -> {System.out.println("hello test");};
        //nothing int the braces (), means that no params used
        //method body , can be used like:
        //className::functionName
        //String::UpperCase
        //System.out::println

        //also if it has 1 param and a return statement
        //(n)-> {return n.toUpperCase()}
        //this can be done like this
        //String::UpperCase

        //now this is very very useful in the stream usage

        //also it understands what is the method params and data type etc



        //implementation of an interface which have just 1 method is called Lambda
        //@FunctionalInterface -> Annotation to indicate that this interface is going
        //to use as lambda function.. it is an indication for others
        //that do not add more methods in this interface
        /**
         * @author Abhishek.sharma
         * @params int, String
         * @usage used for comparing string with something lets say
         *
        **/

        //lambda can also return something, and all of them are like in-built in java now
        //for example, function,predicate,supplier etc

        //for just return in lambda : there is no need to explicit add 'return' in the lambda body
        //Interface  i  = String::toUpperCase
        //it will return upper case of the passed variable

        //also lambda or a function is a first class function
        //means that creating a function and assigning it to variable (it means it is a reference type)
        InterfaceABZ interfaceABZ1 = () -> System.out.println("hello test");;

        //also lambda is a high order function
        //means that any method can accept lambda as a param itself


        //also lambda gets to execute only when the corresponding method is called, it doesn't triggered
        //when it's created, only when the corresponding method is called it gets executed


        //Here discussing Functional Interfaces
        //java provides in-built few functional interfaces to deal with day to day work
        //here are they
        //Supplier,Cosumer,Predicate,Function
        Supplier<Double> random = Math::random; //accepts nothing, return something of type defined
        //example of supplier in testAutomation is DriverFactory

        Consumer<Integer> consumer = System.out::println; //accepts something, and just prints it
        //means returns void always
        //example in writing to DataBase or LogFile
        //foreach method accepts a consumer
        //every collection framework

        Predicate<Integer> p = (n) -> n>2;//accept somthing, does the checks and return boolean
        //filter from stream api accepts a predicate interface
        //also from collection freamwork like list provides methods
        //like 'removeIF' which uses predicate and remove based upon the condition

        /**
         * Stream API usage and high level check
         */

        //steam api works on any collection data-structure
        //also it works like a tradational loops - intStream(1 to 9)

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.stream().filter(i -> i%2==0).limit(3).map(i -> i*i).forEach(System.out::println);


        //finding broken links or URLs which doesn't work

        //finding all image links in a page using @src attribute

        new ChromeDriver().findElements(By.xpath("//*[@src]")) //this will return all elements with src attribute
                .stream()
                .map( e -> e.getAttribute("src")) //to get the value of src attribute
                .forEach(System.out::println); //let's print them

        //to test if the images are broken or not,
        // pass the image URL and test what reponse we're getting
        //if we get other than 200 series response means that
        //those images are broken

        new ChromeDriver().findElements(By.xpath("//*[@src]")) //this will return all elements with src attribute
                .stream()
                .map( e -> e.getAttribute("src"))//to get the value of src attribute
                .map(link -> getResponse(link)) //now pass that link  & check the status
                .forEach(System.out::println); //let's print them


        new ChromeDriver().findElements(By.xpath("//*[@src]")) //this will return all elements with src attribute
                .stream()
                .map( e -> e.getAttribute("src"))//to get the value of src attribute
                 //now pass that link  & check the status
                .forEach(
                        link -> {
                            System.out.println(getResponse(link) +" :: "+link);
                        }
                ); //let's print them


        //using href attribute
        //the link have href attributes
        //images mostly have href attributes

    }


    public static Integer getResponse(String link){
        Integer response = null;
        URL url;
        HttpURLConnection con = null;
        try{
            url = new URL(link);
            con = (HttpURLConnection) url.openConnection();
            response = con.getResponseCode();
        }catch(Exception e){

        }finally {
            if(null != con)
                con.disconnect();;
        }
        return response;
    }
}
