package suport;

import io.cucumber.java.Before;
import pages.HomePage;
import suport.DriverManager;

public class BaseSteps {
    protected HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage(DriverManager.getDriver());
    }
}
