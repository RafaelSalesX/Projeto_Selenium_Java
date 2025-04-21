package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://qazando.com.br/curso.html");
        assertTrue("Não acessou a aplicação!", driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void preencherEmail(){
        driver.findElement(By.id("email")).sendKeys("rafaelsales@gmail.com");

    }

    public void scrollDown() {
        // Usando Duration para o WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Garante que o botão está presente no DOM
        WebElement botao = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button")));

        // Scroll até o botão (só para visualização)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", botao);

        // Aguarda um pouco para dar tempo de ver o scroll (opcional)
        try {
            Thread.sleep(2000); // 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicarBotao(){
        // Pressiona Enter no elemento com foco atual
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void verificaCodigoDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        assertEquals( "QAZANDO15OFF", texto_cupom);
    }

}
