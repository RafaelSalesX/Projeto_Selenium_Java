package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import suport.DriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "~@ignore"
)
public class RunCucumberTest {

    @BeforeClass
    public static void start() {
        DriverManager.getDriver(); // Inicializa o WebDriver antes de todos os testes
    }

    @AfterClass
    public static void stop() {
        DriverManager.quitDriver(); // Finaliza o WebDriver após todos os testes
    }
}
