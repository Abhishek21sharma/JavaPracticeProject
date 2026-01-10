package Java8.DesignPatterns.SRT.FactoryPattern;

import org.testng.Assert;

public class GoogleSearchTest extends BaseTest{
    //see below we're not creating obejcts for
    //each class rather we just creating object for abstract class
    //since all other classes like GoogleEng,GoogleFrench etc have same methods so we will use the abstract class itself

    //it's same like creating a object of List<> l = new ArracyList()
    //or mabe like WebDriver driver = new ChromeDriver etc


    private GooglePage googlePage;

    public void searchTest(String language,String keyword){
        //let's assume this data is coming from BDD feature file
        //laungage and keyword

        //instatiate GooglePage class

        //driver is coming from above BaseTest
        this.googlePage = GoogleFactory.get(language,driver);
        this.googlePage.launchURL();
        this.googlePage.search(keyword);
        int result  = this.googlePage.getResultsCount();

        Assert.assertEquals(result,10,"Error ---> results not matching");
    }
}
