package Java8.DesignPatterns.SRT.DecoratorPattern;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.function.Consumer;

public class Decorators {

    private static void shouldDisplay(List<WebElement> elements){
        elements.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }

    private static void shouldNotDisplay(List<WebElement> elements){
        elements.forEach(element -> Assert.assertFalse(element.isDisplayed()));
    }

    //ingredients
    //means following will be changed at run time
    private static final Consumer<DashboardPAge> adminCompPresense =
            dp -> shouldDisplay(dp.getAdminComp());
    private static final Consumer<DashboardPAge> adminCompNotPresense =
            dp -> shouldNotDisplay(dp.getAdminComp());

    private static final Consumer<DashboardPAge> SUCompPresense =
            dp -> shouldDisplay(dp.getSuperUserComp());
    private static final Consumer<DashboardPAge> SUCompNotPresense =
            dp -> shouldNotDisplay(dp.getSuperUserComp());

    private static final Consumer<DashboardPAge> guestCompPresense =
            dp -> shouldDisplay(dp.getGuestComp());
    private static final Consumer<DashboardPAge> guestCompNotPresense =
            dp -> shouldNotDisplay(dp.getGuestComp());


    //roles selection
    private static final Consumer<DashboardPAge> adminSelection = dp -> dp.selectRole("admin");
    private static final Consumer<DashboardPAge> suSelection = dp -> dp.selectRole("superuser");
    private static final Consumer<DashboardPAge> guestSelection = dp -> dp.selectRole("guest");

    //user role pages
    //a public method which be exposed to other classes
    public static final Consumer<DashboardPAge> guestPage =
            guestSelection.andThen(guestCompPresense).andThen(SUCompNotPresense).andThen(adminCompNotPresense);

    public static final Consumer<DashboardPAge> suPage =
            suSelection.andThen(guestCompPresense).andThen(SUCompPresense).andThen(adminCompNotPresense);

    public static final Consumer<DashboardPAge> adminPage =
            suSelection.andThen(guestCompPresense).andThen(SUCompPresense).andThen(adminCompPresense);
}
