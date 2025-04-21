package suport;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.HomePage;

public class BaseSteps {
    protected HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage(DriverManager.getDriver());
    }

}
