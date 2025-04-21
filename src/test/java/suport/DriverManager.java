package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Configura o caminho do ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafael\\Documents\\MyProjects\\Selenium_Java_Automation\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            System.out.println("Fechando o navegador...");
            driver.quit();
            driver = null;
        }
    }


}
