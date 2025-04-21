package suport;

import io.cucumber.java.After;

public class Hooks {

    @After
    public void fecharBrowser() {
        System.out.println("Fechando navegador via Hook");
        DriverManager.quitDriver();
    }
}
