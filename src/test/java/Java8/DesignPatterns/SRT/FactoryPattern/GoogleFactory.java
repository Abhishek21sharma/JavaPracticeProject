package Java8.DesignPatterns.SRT.FactoryPattern;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GoogleFactory {

    //it will be something like: Google Page = new GoogleEng(d)
    //List<String> l = new ArrayList();


    private static final Function<WebDriver,GooglePage> ENG = d -> new GoogleEng(d);
    private static final Function<WebDriver,GooglePage> FRENCH = d -> new GoogleFrench(d);
    private static final Function<WebDriver,GooglePage> HINDI = d -> new GoogleHindi(d);

    private static final Map<String, Function<WebDriver,GooglePage>> MAP= new HashMap<>();

    static {
        MAP.put("ENG",ENG);
        MAP.put("FRENCH",FRENCH);
        MAP.put("HINDI",HINDI);

    }

    //responsible for building the objects and returns back

    public static GooglePage get(String language, WebDriver driver){
        //it will return GooglePage implementation of English
        return MAP.get(language).apply(driver);
    }
}
