package Java8.DesignPatterns.SRT;

public class SingleResponsiblityPrinciple {
    //Bad code is not just introduce null pointer, it's something like
    //very difficult to introduce new requirements
    //you can't add new if-else block in your methods for new rule/condition/requirement
    //every now and then, as that will make it more difficult to maintain code

    //to note: composition is usually better than inheritance
    //means that create multi classes for each components and connect them up
    //for example in Page Object pattern - instead of 1 class for 1 page, split them up into multi classes
    //based on different functionality on a page
    //so each class will do less of work and hence will be easy to maintain
    //though we end up writing a lot of classes but that way it's better
    //as we know what each class do rather than adding everything in a single class

    //in OOPS don't use if-else, if-else block to accomodate new requirements
    //that's work of procedural language like C
    //in OOPS use polymorphism - Interfaces, multiple classes, inhert them , use the command method etc


    //SingleResponsiblityPrinciple:
    //it means that a class should have only one feature
    //it means that class should be updated for 1 feature only
    //eg - if we deal with Employee class, which calculate salary based upon their DoB
    //and roles
    //it means break them into multiple classes

    //see the rest of the classes code for better understanding


    //package structure
    // a BAse class called AbstractComponent --> extended by componentClass
    // a mainPAge class --> let's say this is the main PAge class, whatever components it needs
    //it will just create an instance of it and use them inside.. so it calls another components
    //classes to do the  work , it's a connector class
    
    // a BAse class called BaseTest --> let's assume we create a webdriver instance in this class
    //create a pkg name --> components, all components which a page needs should be here
    //create a pkg name --> mainPage , all Pages will be there
    //create a pkg name --> tests, all test will be there

}
