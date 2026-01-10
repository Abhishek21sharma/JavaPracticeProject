package Java8.DesignPatterns.SRT.DecoratorPattern;

import Java8.DesignPatterns.SRT.FactoryPattern.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.function.Consumer;

public class DashboardPageTest extends BaseTest {
    private DashboardPAge dashboardPAge;

    @BeforeTest
    public void setDashboardPAge(){
        this.dashboardPAge = new DashboardPAge(driver);
    }

    @Test(dataProvider = "getData")
    public void roleTest(Consumer<DashboardPAge> role){
        this.dashboardPAge.goTo();
        role.accept(this.dashboardPAge);
    }


    //or can be BDD cucumber files or anything
    @DataProvider
    public Object[][] getData(){
        return (Object[][]) new Object[]{
                Decorators.guestPage,
                Decorators.suPage,
                Decorators.adminPage
        };
    }
}
