package steps;


import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import runner.RunCucumberTest;


import java.time.Duration;


public class DescontosStep extends RunCucumberTest {



    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando(){

        driver.get("https://qazando.com.br/curso.html");
        Assert.assertEquals("Não acessou a aplicação!",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());

    }
    @Quando("eu preencho meu email")
    public void eu_preencho_meu_email() {

        driver.findElement(By.id("email")).sendKeys("rafaelsales@gmail.com");

    }
    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Garante que o botão está presente no DOM
        WebElement botao = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button")));

        // Scroll até o botão (só pra visualização mesmo)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", botao);

        // Aguarda um pouco pra dar tempo de ver o scroll (opcional)
        try {
            Thread.sleep(1000); // 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Pressiona Enter no elemento com foco atual
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }



    @Entao("eu vejo o codigo de desconto")
    public void eu_vejo_o_codigo_de_desconto() {

        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();

        Assert.assertEquals( "QAZANDO15OFF", texto_cupom);
    }
}
